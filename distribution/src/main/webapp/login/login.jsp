<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setHeader("Expires", "0"); // Proxies.
        if (session.getAttribute("authenticated") != null && session.getAttribute("authenticated").equals(true)) {
            response.sendRedirect("../index.jsp");
        }
    %>
    <title>Login Page</title>
    <meta charset="UTF-8">
    <link rel="shortcut icon" type="image/png" href="../images/favicon.png"/>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../css/jquery-ui.min.css">
    <link rel="stylesheet" type="text/css" href="../css/custom.css">
    <script src="../js/jquery-1.11.3.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/jquery-ui.min.js"></script>
    <script src="../js/jquery.tabletojson.js"></script>
    <script src="../js/typeahead.js"></script>
    <script src="../js/custom.js"></script>

</head>
<body>
<input type="hidden" id="refreshed" value="no">
<div class="container">

    <form class="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputUserName" class="sr-only">Email address</label>
        <input type="username" name="username" id="inputUserName" class="form-control" placeholder="User name"
               required="" autofocus="">
        <br>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password"
               required="">
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>

</div>
</body>
</html>
