package com.platformService.dao;

import com.platformService.dao.interfaces.DAO;
import com.platformService.model.Task;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskDao implements DAO<Task> {

    SqlImplementation sqlImplementation = new SqlImplementation();
    PreparedStatement preparedStatement = null;


    @Override
    public void create(Task object) throws SQLException {

        preparedStatement = sqlImplementation.prepareQuery("Insert into task (" +
                "product_name" +
                ", user_id" +
                ", user_desc" +
                ", service_desc" +
                ", status_id" +
                ") " +
                "values (?,?,?,?,?)");

        PrepareSql(object);

    }

    @Override
    public List<Task> read() throws SQLException {
        ResultSet resultSet = sqlImplementation.selectQuery("Select * from task");
        List<Task> taskList = new ArrayList<>();
        while (resultSet.next()) {
            taskList.add(new Task(
                    resultSet.getString("product_name"),
                    resultSet.getInt("user_ID"),
                    resultSet.getString("user_desc"),
                    resultSet.getString("service_desc"),
                    resultSet.getInt("status_id")));
        }
        return taskList;
    }

    @Override
    public void update(Task object, int index) throws SQLException {

        preparedStatement = sqlImplementation.prepareQuery("UPDATE task SET user_desc = ? , service_desc = ? , status_id = ? WHERE id = ? ");

        preparedStatement.setString(1, object.getUserDesc());
        preparedStatement.setString(2, object.getServiceDesc());
        preparedStatement.setInt(3, object.getIdStatus());
        preparedStatement.setInt(4, index);
        preparedStatement.executeUpdate();
        preparedStatement.close();


    }

    private void PrepareSql(Task object) throws SQLException {
        preparedStatement.setString(1, object.getPorduct_name());
        preparedStatement.setInt(2, object.getUser_id());
        preparedStatement.setString(3, object.getUserDesc());
        preparedStatement.setString(4, object.getServiceDesc());
        preparedStatement.setInt(5, object.getIdStatus());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public List<Integer> getIdTask() throws SQLException {
        List<Integer> idList = new ArrayList<>();
        ResultSet resultSet = sqlImplementation.selectQuery("SELECT id FROM task");

        while (resultSet.next()){
            idList.add(resultSet.getInt("id"));
        }
    return idList;

    }
}
