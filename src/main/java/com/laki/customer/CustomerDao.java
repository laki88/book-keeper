package com.laki.customer;

import io.swagger.model.Customer;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CustomerDao {

    public static boolean addCustomer(Customer customer) {
        try {
            JdbcDataSource ds = new JdbcDataSource();
            String tomcatHome = System.getProperty("catalina.base");
            ds.setURL("jdbc:h2:" + tomcatHome + "/database/book-keeper");
            ds.setUser("sa");
            ds.setPassword("sa");
            Connection conn = ds.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT  INTO CUSTOMER (NAME, ADDRESS, TELEPHONE_NO, EMAIL_ADDRESS, FAX_NUMBER) VALUES ('" +
                    customer.getName() + "','" + customer.getAddress() + "','" + customer.getPhoneNumber() + "','" +
                    customer.getEmailAddress() + "','" + customer.getFaxNumber() + "')");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }
}
