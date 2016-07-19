<%--
  Created by IntelliJ IDEA.
  User: Lakshman
  Date: 7/17/16
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    response.setHeader("Expires", "0"); // Proxies.
    session = request.getSession(false);// don't create if it doesn't exist
    String webAppRoot = request.getContextPath();
    if (session.isNew() || session.getAttribute("authenticated") == null || false == (boolean) session.getAttribute("authenticated")) {
        response.sendRedirect(webAppRoot+ "/login/login.jsp");
    }
%>
