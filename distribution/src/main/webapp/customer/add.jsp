<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Customer</title>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../css/jquery-ui.min.css">
    <link rel="stylesheet" type="text/css" href="../css/custom.css">
    <script src="../js/jquery-1.11.3.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/jquery-ui.min.js"></script>
    <script src="../js/custom.js"></script>
</head>
<body>

<form role="form" id="customer_add_form" method="post" action="customer/add">
    <div class="form-group">
        <label for="name">Name:</label>
        <input type="name" class="form-control" id="name" name="name">
    </div>
    <div class="form-group">
        <label for="address">Address:</label>
        <input type="address" class="form-control" id="address" name="address">
    </div>
    <div class="form-group">
        <label for="tpNo">TP No:</label>
        <input type="tpNo" class="form-control" id="tpNo" name="tpNo">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
    <button class="btn btn-default">Cancel</button>
</form>

</body>
</html>
