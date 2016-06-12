<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    session = request.getSession(false);
    String user = null;

    if (session != null) {
        user = (String) session.getAttribute("user");
    }
%>
<style>
    #custom-bootstrap-menu.navbar-default .navbar-brand {
        color: rgba(119, 119, 119, 1);
    }

    #custom-bootstrap-menu.navbar-default {
        font-size: 14px;
        background-color: rgba(0, 0, 0, 1);
        border-width: 1px;
        border-radius: 4px;
    }

    #custom-bootstrap-menu.navbar-default .navbar-nav > li > a {
        color: rgba(119, 119, 119, 1);
        background-color: rgba(248, 248, 248, 0);
    }

    #custom-bootstrap-menu.navbar-default .navbar-nav > li > a:hover,
    #custom-bootstrap-menu.navbar-default .navbar-nav > li > a:focus {
        color: rgba(51, 51, 51, 1);
        background-color: rgba(248, 248, 248, 0);
    }

    #custom-bootstrap-menu.navbar-default .navbar-nav > .active > a,
    #custom-bootstrap-menu.navbar-default .navbar-nav > .active > a:hover,
    #custom-bootstrap-menu.navbar-default .navbar-nav > .active > a:focus {
        color: rgba(85, 85, 85, 1);
        background-color: rgba(231, 231, 231, 1);
    }

    #custom-bootstrap-menu.navbar-default .navbar-toggle {
        border-color: #ddd;
    }

    #custom-bootstrap-menu.navbar-default .navbar-toggle:hover,
    #custom-bootstrap-menu.navbar-default .navbar-toggle:focus {
        background-color: #ddd;
    }

    #custom-bootstrap-menu.navbar-default .navbar-toggle .icon-bar {
        background-color: #888;
    }

    #custom-bootstrap-menu.navbar-default .navbar-toggle:hover .icon-bar,
    #custom-bootstrap-menu.navbar-default .navbar-toggle:focus .icon-bar {
        background-color: #000000;
    }
</style>
<div id="custom-bootstrap-menu" class="navbar navbar-default " role="navigation">
    <div class="container-fluid">
        <div class="collapse navbar-collapse navbar-menubuilder">
            <ul class="nav navbar-nav navbar-left">
                <li class="active">
                    <a href="/book-keeper">Home</a>
                </li>
                <li>
                    <a href="/book-keeper/invoice/invoice.jsp">Invoice</a>
                </li>
                <li>
                    <a href="/book-keeper/inventory/add.jsp">Inventory</a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-left pull-right">
                <%
                    if (user != null) {
                %>
                <li class="dropdown">
                    <a class="dropdown-toggle" href="#" data-toggle="dropdown">
                        <%=
                        user
                        %>
                        <img src="images/down_arrow.png" width="15px" height="15px">
                    </a>
                    <div class="dropdown-menu pull-right">
                        <ul class="nav">
                            <li>
                                <a href="/book-keeper/login/logout.jsp">Logout</a>
                            </li>
                        </ul>
                    </div>
                </li>
                <%
                    }
                %>
            </ul>
        </div>
    </div>
</div>
