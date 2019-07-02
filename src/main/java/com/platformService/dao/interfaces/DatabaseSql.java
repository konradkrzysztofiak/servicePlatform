package com.platformService.dao.interfaces;

import java.sql.SQLException;

public interface DatabaseSql <T, K> {
    T prepareQuery(String sql) throws SQLException;
    K selectQuery(String sql) throws SQLException;

}
