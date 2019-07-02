package com.platformService.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
    void create(T object) throws SQLException;
    List<T> read() throws SQLException;
    void update(T object, int index) throws SQLException;

}
