package com.laki;

import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.Server;

import javax.servlet.ServletContextEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;


public class InitH2DBServer implements javax.servlet.ServletContextListener {

    Server webServer = null;


    public void contextInitialized(ServletContextEvent servletContextEvent) {

        try {
            webServer = Server.createWebServer().start();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JdbcDataSource ds = new JdbcDataSource();
        String tomcatHome = System.getProperty("catalina.base");
        ds.setURL("jdbc:h2:" + tomcatHome + "/database/book-keeper");
        ds.setUser("sa");
        ds.setPassword("sa");

        try {
            Connection conn = ds.getConnection();

            ScriptRunner runner = new ScriptRunner(conn, false, false);
            URL url = getClass().getResource("../../scripts/sql/h2.sql");
            if (url != null) {
                String filePath = url.getPath();
                runner.runScript(new BufferedReader(new FileReader(filePath)));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        webServer.stop();
    }
}
