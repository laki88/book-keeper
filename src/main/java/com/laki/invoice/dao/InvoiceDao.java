package com.laki.invoice.dao;

import io.swagger.model.Customer;
import io.swagger.model.Invoice;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

/**
 * Created by Lakshman on 4/23/16.
 */
public class InvoiceDao {

	public static boolean addInvoice(Invoice invoice, Map<String, Integer> items) {
		try {
			JdbcDataSource ds = new JdbcDataSource();
			String tomcatHome = System.getProperty("catalina.base");
			ds.setURL("jdbc:h2:"+tomcatHome+"/database/book-keeper");
			ds.setUser("sa");
			ds.setPassword("sa");
			Connection conn = ds.getConnection();
			Statement stmt = conn.createStatement();
			Customer customer = invoice.getCustomer();
			stmt.executeUpdate("INSERT  INTO CUSTOMER (NAME, ADDRESS, TELEPHONE_NO) VALUES ('"+
			                   customer.getName()+"','"+customer.getAddress()+"','"+customer.getPhoneNumber()+"')");

			ResultSet rs = stmt.executeQuery("SELECT CUSTOMER_ID FROM CUSTOMER WHERE NAME = " + customer.getName());
			int customerId = 0;
			while (rs.next()) {
				customerId = rs.getInt("CUSTOMER_ID");
			}

			stmt.executeUpdate("INSERT  INTO INVOICE (CUSTOMER_ID, ITEM_CODE, QUANTITY) VALUES ('"+
			                   customerId +"','"+customer.getAddress()+"','"+customer.getPhoneNumber()+"')");

			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
