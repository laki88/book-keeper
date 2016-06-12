package com.laki.stakeholder.dao;


import com.laki.stakeholder.bean.Supplier;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StakeHolderDao {

    private static JdbcDataSource dataSource;

    private static StakeHolderDao stakeHolderDao;

    private StakeHolderDao() {
        dataSource = new JdbcDataSource();
        String tomcatHome = System.getProperty("catalina.base");
        dataSource.setURL("jdbc:h2:" + tomcatHome + "/database/book-keeper");
        dataSource.setUser("sa");
        dataSource.setPassword("sa");
    }

    public static StakeHolderDao getInstance() {
        return stakeHolderDao;
    }

    public static boolean saveSupplier(Supplier supplier) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement("INSERT INTO SUPPLIER VALUES (?, ?, ?, ?, ?, ?)");

            stmt.setString(1, supplier.getId());
            stmt.setString(2, supplier.getName());
            stmt.setString(3, supplier.getAddress());
            stmt.setString(4, supplier.getTpNo());
            stmt.setString(5, supplier.getEmailAddress());
            stmt.setString(6, supplier.getFaxNo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    public static Supplier getSupplier(String id) {

        Supplier supplier = new Supplier();
        supplier.setId(id);

        Connection conn = null;
        PreparedStatement stmt = null;

        try {

            conn = dataSource.getConnection();

            stmt = conn.prepareStatement("SELECT * FROM SUPPLIER WHERE ID=?");

            stmt.setString(1, id);

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                supplier.setName(resultSet.getString("NAME"));
                supplier.setAddress(resultSet.getString("ADDRESS"));
                supplier.setEmailAddress(resultSet.getString("EMAIL_ADDRESS"));
                supplier.setFaxNo(resultSet.getString("FAX_NUMBER"));
                supplier.setTpNo(resultSet.getString("TELEPHONE_NO"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return supplier;
    }


    public static boolean updateSupplier(Supplier supplier) {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement("UPDATE SUPPLIER SET NAME = ?, ADDRESS = ?, TELEPHONE_NO = ?, EMAIL_ADDRESS = ?, FAX_NUMBER=? WHERE ID=?");

            stmt.setString(1, supplier.getName());
            stmt.setString(2, supplier.getAddress());
            stmt.setString(3, supplier.getTpNo());
            stmt.setString(4, supplier.getEmailAddress());
            stmt.setString(5, supplier.getFaxNo());
            stmt.setString(6, supplier.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    public static boolean deleteSupplier(String id) {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement("DELETE FROM SUPPLIER WHERE ID = ?");

            stmt.setString(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }
}
