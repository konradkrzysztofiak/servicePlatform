package com.platformService.DAO.INTERFACES;

import java.sql.SQLException;

public interface DatabaseSql <T> {
    T prepareQuery(String sql) throws SQLException;

}
