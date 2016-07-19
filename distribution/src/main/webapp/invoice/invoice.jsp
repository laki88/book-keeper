<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <%@ include file="../common.jsp" %>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../css/jquery-ui.min.css">
    <link rel="stylesheet" type="text/css" href="../css/custom.css">
    <script src="../js/jquery-1.11.3.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/jquery-ui.min.js"></script>
    <script src="../js/jquery.tabletojson.js"></script>
    <script src="../js/typeahead.js"></script>
    <script src="../js/custom.js"></script>

    <title>create an invoice</title>
    <script>
        $(function () {
            $("#header").load("../header.jsp");
            $("#footer").load("../footer.jsp");
        });
    </script>
</head>
<body>
<div id="header"></div>
<div class="container container-top">
    <form name="invoice_form" id="invoice_form" method="put" action="../services/invoice/add">
        <div class="row">
            <div class="col-md-5">
                <div class="form-group">
                    <label for="invoiceNo" class="control-label col-md-4">Invoice Number :</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="invoiceNo" name="invoiceNo" value="1" disabled>
                    </div>
                </div>
            </div>
        </div>
        <div class="row row-bottom-margin">
            <div class="col-md-5">
                <div class="form-group">
                    <label for="name" class="control-label col-md-4">Name :</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control component-position" id="name" name="name"
                               placeholder="Lakshman">
                    </div>
                </div>
            </div>
            <div class="col-md-2"></div>
            <div class="col-md-5">
                <div class="form-group">
                    <label for="date" class="control-label col-md-4">Date :</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" name="date" id="date">
                    </div>
                </div>
            </div>
        </div>
        <div class="row row-bottom-margin">
            <div class="col-md-5">
                <div class="form-group">
                    <label for="address" class="control-label col-md-4">Address :</label>
                    <div class="col-md-8">
                        <textarea id="address" name="address" class="form-control text-padding component-position"
                                  rows="5" cols="30">  </textarea>
                    </div>
                </div>
            </div>
            <div class="col-md-2"></div>
            <div class="col-md-5">
                <div class="form-group">
                    <label for="tpNo" class="control-label col-md-4">Telephone No :</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="tpNo" name="tpNo">
                    </div>
                </div>
            </div>
        </div>
        <div class="row row-bottom-margin">
            <div class="col-md-1"></div>
            <div class="col-md-11" style="height:292px;overflow:auto;">
                <table class="table-striped" id="invoice-table" name="invoice-table">
                    <input type="hidden" name="invoice-table" value=""/>
                    <thead>
                    <tr>
                        <th id="item-code">Item Code</th>
                        <th id="quantity">Quantity</th>
                        <th id="description">Description</th>
                        <th id="unit-price">Unit Price</th>
                        <th id="amount">Amount</th>
                        <th id="tax">Tax</th>
                    </tr>
                    </thead>
                    <tbody></tbody>
                </table>
            </div>
        </div>
        <div class="row row-bottom-margin">
            <div class="col-md-6 col-md-offset-7">
                <div class="form-group">
                    <label class="col-md-4" for="total">Total :</label>
                    <div class="col-md-6">
                        <input class="form-control col-md-3" type="text" id="total" disabled>
                    </div>
                </div>
            </div>
        </div>
        <div class="row row-bottom-margin">
            <div class="col-md-6 col-md-offset-7">
                <div class="form-group">
                    <label class="col-md-4" for="payment">Payment :</label>
                    <div class="col-md-6">
                        <input class="form-control col-md-3" type="text" id="payment">
                    </div>
                </div>
            </div>
        </div>
        <div class="row row-bottom-margin">
            <div class="col-md-6 col-md-offset-7">
                <div class="form-group">
                    <label class="col-md-4" for="balance">Balance :</label>
                    <div class="col-md-6">
                        <input class="form-control col-md-3" type="text" id="balance" disabled>
                    </div>
                </div>
            </div>
        </div>
        <div class="row row-bottom-margin">
            <div class="col-md-8"></div>
            <div class="col-md-4">
                <input type="submit" name="save_and_close" class="btn btn-primary form-button-group pull-right"
                       value="Save & Close">
                <input type="submit" name="save_and_new" class="btn btn-primary form-button-group pull-right"
                       value="Save & New">
                <input type="button" class="btn btn-primary clear-button form-button-group pull-right" value="Clear">
            </div>
        </div>
    </form>
</div>
<div id="footer"></div>
</body>
</html>