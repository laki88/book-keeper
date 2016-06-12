<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout</title>
    <%
        if (session != null) {
            session.invalidate();
            response.sendRedirect("login.jsp");
        }
    %>
</head>
<body>

</body>
</html>
