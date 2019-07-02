package com.platformService.dao;

import com.platformService.dao.interfaces.DAO;
import com.platformService.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements DAO<User> {
    SqlImplementation sqlImplementation = new SqlImplementation();
    PreparedStatement preparedStatement = null;
    @Override
    public void create(User user) throws SQLException {

        preparedStatement = sqlImplementation.prepareQuery("Insert into users (name, pass, email) values (?,?,?)");

        preparedStatement.setString(1,user.getUserName());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.geteMail());

        preparedStatement.executeUpdate();
        preparedStatement.close();

    }

    @Override
    public List read() throws SQLException {
        ResultSet resultSet = sqlImplementation.selectQuery("Select * from users");
        List<User> userList = new ArrayList<>();
        while (resultSet.next()){
            userList.add(new User(
                    resultSet.getString("name"),
                    resultSet.getString("pass"),
                    resultSet.getString("email")));

        }


        return userList;
    }

    @Override
    public void update(User user, int index) throws SQLException {
        preparedStatement = sqlImplementation.prepareQuery("Update users Set name = ?, pass = ?, email = ? Where id = ?");
        preparedStatement.setString(1,user.getUserName());
        preparedStatement.setString(2,user.getPassword());
        preparedStatement.setString(3,user.geteMail());
        preparedStatement.setInt(4,index);
    }
}
