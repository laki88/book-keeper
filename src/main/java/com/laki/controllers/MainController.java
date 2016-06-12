package com.laki.controllers;

import com.laki.customer.CustomerImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MainController extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {


        String requestedURIPath = request.getRequestURI();
        String modulePath = requestedURIPath.substring(requestedURIPath.indexOf("/", 1) + 1);
        //TODO break requestURIPath to modulePath and actionPath
        //TODO refactor the code here

        if ("invoice".equals(modulePath)) {
            RequestDispatcher view = request.getRequestDispatcher("invoice/invoice.jsp");
            // don't add your web-app name to the path
            view.forward(request, response);
        } else if ("customer".equals(modulePath)) { //for now I checked action and module as same as module path
            RequestDispatcher view = request.getRequestDispatcher("customer/add.jsp");
            view.forward(request, response);
        } else {
            response.getWriter().write("<html><body>GET response</body></html>");
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestedURIPath = request.getRequestURI();
        String modulePath = requestedURIPath.substring(requestedURIPath.indexOf("/", 1) + 1);

        if ("customer/add".equals(modulePath)) { //for now I checked action and module as same as module path
            CustomerImpl cust = new CustomerImpl();
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String tpNo = request.getParameter("tpNo");
            cust.addCustomer(name, address, tpNo);
        }


    }
}
