package com.platformService.dao;
import com.platformService.dao.interfaces.DatabaseSql;

import java.sql.*;


public class SqlImplementation implements DatabaseSql<PreparedStatement, ResultSet> {
    private ConnectToSql connect;
    private PreparedStatement preparedStatement = null;
    //private ResultSet resultSet;

    public SqlImplementation() {
        connect = new ConnectToSql();
    }


    @Override
    public PreparedStatement prepareQuery(String sql) throws SQLException {
        ConnectToSql connectToSql = new ConnectToSql();
        Connection connection = connectToSql.connect();

        this.preparedStatement = connection.prepareStatement(sql);

        return preparedStatement;


    }

    @Override
    public ResultSet selectQuery(String sql) throws SQLException {
        ResultSet resultSet = prepareQuery(sql).executeQuery();
        return resultSet;
    }
}
