package com.platformService.DAO;
import com.platformService.DAO.INTERFACES.DatabaseSql;

import java.sql.*;


public class SqlImplementation implements DatabaseSql {
    ConnectToSql connect;

    public SqlImplementation() {
        connect = new ConnectToSql();
    }


    public PreparedStatement prepareQuery(String sql) throws SQLException {

        ConnectToSql connectToSql = new ConnectToSql();
        Connection connection = connectToSql.connect();
        PreparedStatement preparedStatement = null;
        preparedStatement = connection.prepareStatement(sql);

        return preparedStatement;

    }


}
