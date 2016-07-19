package com.laki.invoice.dao;

import com.laki.invoice.bean.InvoiceBean;
import org.h2.jdbcx.JdbcDataSource;

/**
 * Created by Lakshman on 7/19/16.
 */
public class InvoiceDao {

    private static JdbcDataSource dataSource;

    private static InvoiceDao invoiceDao = new InvoiceDao();

    private InvoiceDao() {
        dataSource = new JdbcDataSource();
        String tomcatHome = System.getProperty("catalina.base");
        dataSource.setURL("jdbc:h2:" + tomcatHome + "/database/book-keeper");
        dataSource.setUser("sa");
        dataSource.setPassword("sa");
    }

    public static InvoiceDao getInstance() {
        return invoiceDao;
    }


    public static boolean persistItem() {
        return false;
    }

    public static boolean updateItem() {
        return false;
    }

    public static InvoiceBean getItem(String invoiceCode) {
        return null;
    }

    public static boolean deleteItem(String invoiceCode) {
        return false;
    }

}
