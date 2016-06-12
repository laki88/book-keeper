//Create new rows in table
var makeNewRowToTable = function () {
    var numberOfColumns = $('#invoice-table > thead > tr > th').length;
    var newLineToBeAppended = "<tr>";
    for (var j = 0; j < numberOfColumns; j++) {
        newLineToBeAppended += "<td>&nbsp;</td>";
    }
    newLineToBeAppended += "</tr>";
    $('#invoice-table > tbody:last-child').append(newLineToBeAppended);
}

//For the given column index and row index, will return table cell object
var getTableCellByRowAndCol = function (table, rowIndex, columnIndex) {
    var rows = $('tr', table);
    var current_row = rows.eq(rowIndex + 1);
    return current_row.find('td:eq(' + columnIndex + ')');
}

//Create amount column by multiplying unit price column and quantity column
var makeAmountColumn = function (current_cell, table, firstColumn, secondColumn, amountColumn) {
    var current_row_index = current_cell.parent().index();
    var current_col_index = current_cell.index();
    if (current_col_index == firstColumn.index()) {
        if (current_cell.text().match(/^\d+$/) && getTableCellByRowAndCol(table, current_row_index, secondColumn.index()).text().match(/^\d+$/)) {
            getTableCellByRowAndCol(table, current_row_index, amountColumn.index()).html(current_cell.text() * getTableCellByRowAndCol(table, current_row_index, secondColumn.index()).text());
        }
    }
    else if (current_col_index == secondColumn.index()) {
        if (current_cell.text().match(/^\d+$/) && getTableCellByRowAndCol(table, current_row_index, firstColumn.index()).text().match(/^\d+$/)) {
            getTableCellByRowAndCol(table, current_row_index, amountColumn.index()).html(current_cell.text() * getTableCellByRowAndCol(table, current_row_index, firstColumn.index()).text());
        }
    }
    else {
        return;
    }
}

//Return true if row is completely filled with data
var checkRowFilled = function (tableData) {
    var all_cell_filled = true;
    var allTDsInRow = tableData.parent().find("td");
    for (var tdIndex = 0; tdIndex < allTDsInRow.length; tdIndex++) {
        var td = allTDsInRow[tdIndex];
        if ($(td).html().trim() === "&nbsp;" || $(td).html().trim() === "") {
            all_cell_filled = false;
        }
    }
    return all_cell_filled;
}

//Create total value by adding amount column
var makeTotal = function (tableId, columnIndex) {
    var total = 0;
    //Iterate all td's in column index
    $('#' + tableId + ' tbody tr td:nth-child(' + columnIndex + ')').each(function () {
        if (!isNaN(parseInt($(this).text()))) {
            total += parseInt($(this).text());
        }
    });
    $('#total').val(total);
}

$(document).ready(function () {

    $('form').attr('autocomplete', 'off');
    for (var i = 0; i < 10; i++) {
        makeNewRowToTable();
    }

    $('#invoice-table').on("click", "td", function () {
        $(this).attr("contenteditable", true);
        if ($(this).html() == "&nbsp;") {
            $(this).html("");
        }

    });

    $("td").blur(function () {

        makeAmountColumn($(this), $("#invoice-table"), $("#quantity"), $("#unit-price"), $("#amount"));

        if (checkRowFilled($(this))) {
            makeNewRowToTable();
        }

        makeTotal("invoice-table", $('#amount').index() + 1);

    });

    $('#payment').blur(function () {
        var payment = parseInt($('#payment').val());
        var total = parseInt($('#total').val());
        $('#balance').val(total - payment);
    });

    $("#date").datepicker();

    $(".clear-button").click(function () {
        $("#invoice_form")[0].reset();
    });

    //callback handler for form submit
    $("#invoice_form").submit(function (e) {
        var postData = $(this).serializeArray();
        var formURL = $(this).attr("action");
        var tableData = JSON.stringify($('#invoice-table').tableToJSON());
        for (var i = 0; i < postData.length; i++) {
            if (postData[i].name == 'invoice-table') {
                postData[i].name = "invoiceTable";
                postData[i].value = tableData;
                break;
            }
        }
        $.ajax(
            {
                url: formURL,
                type: "PUT",
                data: postData,
                success: function (data, textStatus, jqXHR) {
                    alert(data);
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    //if fails
                }
            });
        e.preventDefault(); //STOP default action
        // e.unbind(); //unbind. to stop multiple form submit.
    });


    //callback handler for form submit
    $("#inventory_form").submit(function (e) {
        var postData = $(this).serializeArray();
        var formURL = $(this).attr("action");

        $.ajax(
            {
                url: formURL,
                type: "PUT",
                data: postData,
                success: function (data, textStatus, jqXHR) {
                    alert(data);
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    //if fails
                }
            });
        e.preventDefault(); //STOP default action
        // e.unbind(); //unbind. to stop multiple form submit.
    });

    $("#customer_add_form").submit(function (e) {
        var postData = $(this).serializeArray();
        var formURL = $(this).attr("action");
        $.ajax(
            {
                url: formURL,
                type: "PUT",
                data: postData,
                success: function (data, textStatus, jqXHR) {
                    alert(data);
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    //if fails
                }
            });
        e.preventDefault(); //STOP default action
        // e.unbind(); //unbind. to stop multiple form submit.
    });


    //begin typeahed part----------------------------------------------------------------------------------------------

    var substringMatcher = function (strs) {
        return function findMatches(q, cb) {
            var matches, substringRegex;

            // an array that will be populated with substring matches
            matches = [];

            // regex used to determine if a string contains the substring `q`
            substrRegex = new RegExp(q, 'i');

            // iterate through the pool of strings and for any string that
            // contains the substring `q`, add it to the `matches` array
            $.each(strs, function (i, str) {
                if (substrRegex.test(str)) {
                    matches.push(str);
                }
            });

            cb(matches);
        };
    };

    var names = ['Alabama', 'Alaska', 'Arizona', 'Arkansas', 'California',
        'Colorado', 'Connecticut', 'Delaware', 'Florida', 'Georgia', 'Hawaii',
        'Idaho', 'Illinois', 'Indiana', 'Iowa', 'Kansas', 'Kentucky', 'Louisiana',
        'Maine', 'Maryland', 'Massachusetts', 'Michigan', 'Minnesota',
        'Mississippi', 'Missouri', 'Montana', 'Nebraska', 'Nevada', 'New Hampshire',
        'New Jersey', 'New Mexico', 'New York', 'North Carolina', 'North Dakota',
        'Ohio', 'Oklahoma', 'Oregon', 'Pennsylvania', 'Rhode Island',
        'South Carolina', 'South Dakota', 'Tennessee', 'Texas', 'Utah', 'Vermont',
        'Virginia', 'Washington', 'West Virginia', 'Wisconsin', 'Wyoming'
    ];

    $('#invoice_form #name').typeahead({
            hint: true,
            highlight: true,
            minLength: 1
        },
        {
            name: 'names',
            source: substringMatcher(names)
        });


    //end typeahead part----------------------------------------------------------------------------------------------

    $(".form-signin").submit(function (e) {

        var url = "../services/login/login"; // the script where you handle the form input.

        $.ajax({
            type: "POST",
            url: url,
            data: $(".form-signin").serialize(), // serializes the form's elements.
            success: function (data) {
                var json = JSON.parse(data);
                if (json.authenticated == true) {
                    window.location.href = "/book-keeper";
                }

            },
            error: function (xhr, error) {
                alert(error);
            }
        });

        e.preventDefault(); // avoid to execute the actual submit of the form.
    });

});
