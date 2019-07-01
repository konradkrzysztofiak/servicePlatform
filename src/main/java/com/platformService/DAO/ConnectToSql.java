package com.platformService.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToSql {
    public Connection connection = null;


    public Connection connect() {

        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:src/resources/platformService.db";

            connection = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println("no file");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
