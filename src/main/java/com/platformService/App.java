package com.platformService;


import com.platformService.DAO.ConnectToSql;
import com.platformService.DAO.SqlImplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args ) throws SQLException {
//        SqlImplementation sqlImplementation = new SqlImplementation();
//        PreparedStatement preparedStatement = sqlImplementation.prepareQuery("Insert into users (password, name, id_permission, is_logged) values (?,?,?,?)");
//
//        preparedStatement.setString(1,"Dupa");
//        preparedStatement.setString(2, "Password");
//        preparedStatement.setInt(3,1);
//        preparedStatement.setInt(4,1);
//        preparedStatement.executeUpdate();
//        preparedStatement.close();
//        System.out.println( "Hello World!" );
//        System.out.println("dupa");
        System.out.println("Yo world");
    }
}
