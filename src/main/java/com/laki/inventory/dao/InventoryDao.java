package com.laki.inventory.dao;

import io.swagger.model.Customer;
import io.swagger.model.Inventory;
import io.swagger.model.Vendor;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Created by Lakshman on 5/8/16.
 */
public class InventoryDao {

    public static boolean addInventory(Inventory inventory) {
        try {
            JdbcDataSource ds = new JdbcDataSource();
            String tomcatHome = System.getProperty("catalina.base");
            ds.setURL("jdbc:h2:" + tomcatHome + "/database/book-keeper");
            ds.setUser("sa");
            ds.setPassword("sa");
            Connection conn = ds.getConnection();
            Statement stmt = conn.createStatement();
            Vendor vendor = inventory.getVendor();
            //stmt.executeUpdate("INSERT INTO VENDOR (NAME, ADDRESS, TELEPHONE_NO) VALUES ('"+vendor.getName()+"','"+vendor.getAddress()+"','"+vendor.getPhoneNumber()+"')");


//            stmt.executeUpdate("INSERT  INTO INVENTORY (NAME, ADDRESS, TELEPHONE_NO) VALUES ('"+
//                    customer.getName()+"','"+customer.getAddress()+"','"+customer.getPhoneNumber()+"')");
//
//            ResultSet rs = stmt.executeQuery("SELECT CUSTOMER_ID FROM CUSTOMER WHERE NAME = " + customer.getName());
//            int customerId = 0;
//            while (rs.next()) {
//                customerId = rs.getInt("CUSTOMER_ID");
//            }
//
//            stmt.executeUpdate("INSERT  INTO INVOICE (CUSTOMER_ID, ITEM_CODE, QUANTITY) VALUES ('"+
//                    customerId +"','"+customer.getAddress()+"','"+customer.getPhoneNumber()+"')");

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
