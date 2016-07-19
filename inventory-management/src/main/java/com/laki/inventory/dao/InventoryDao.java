package com.laki.inventory.dao;

import com.laki.inventory.bean.InventoryItem;

import java.sql.*;

import org.h2.jdbcx.JdbcDataSource;


public class InventoryDao {

    private static JdbcDataSource dataSource;

    private static InventoryDao inventoryDao = new InventoryDao();

    private InventoryDao() {
        dataSource = new JdbcDataSource();
        String tomcatHome = System.getProperty("catalina.base");
        dataSource.setURL("jdbc:h2:" + tomcatHome + "/database/book-keeper");
        dataSource.setUser("sa");
        dataSource.setPassword("sa");
    }

    public static InventoryDao getInstance() {
        return inventoryDao;
    }

    public boolean saveItem(InventoryItem inventoryItem) {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement("INSERT INTO INVENTORY VALUES (?,?,?,?,?)");

            stmt.setString(1, inventoryItem.getInventoryCode());
            stmt.setString(2, inventoryItem.getItemName());
            stmt.setString(3, inventoryItem.getDescription());
            stmt.setInt(4, inventoryItem.getPriceOfItem());
            stmt.setInt(5, inventoryItem.getAmount());


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

    public InventoryItem getItem(String inventoryCode) {

        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.setInventoryCode(inventoryCode);

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = dataSource.getConnection();


            stmt = conn.prepareStatement("SELECT * from INVENTORY WHERE INVENTORY_CODE=?");

            stmt.setString(1, inventoryCode);

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                inventoryItem.setItemName(resultSet.getString("NAME"));
                inventoryItem.setDescription(resultSet.getString("DESCRIPTION"));
                inventoryItem.setPriceOfItem(resultSet.getInt("EACH_PRICE"));
                inventoryItem.setAmount(resultSet.getInt("AMOUNT"));

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

        return inventoryItem;
    }


    public boolean updateItem(InventoryItem inventoryItem) {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement("UPDATE INVENTORY SET NAME = ?, DESCRIPTION = ?, EACH_PRICE = ?, AMOUNT = ? WHERE ITEM_CODE=?");

            stmt.setString(1, inventoryItem.getItemName());
            stmt.setString(2, inventoryItem.getDescription());
            stmt.setInt(3, inventoryItem.getPriceOfItem());
            stmt.setInt(4, inventoryItem.getAmount());
            stmt.setString(5, inventoryItem.getInventoryCode());

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

    public boolean deleteItem(String inventoryCode) {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement("DELETE FROM INVENTORY WHERE ITEM_CODE = ?");

            stmt.setString(1, inventoryCode);

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
