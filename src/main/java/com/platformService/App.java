package com.platformService;
import com.platformService.Controller.LoginFrameController;
import java.sql.SQLException;

public class App 
{


    public static void main(String[] args ) throws SQLException {
        LoginFrameController loginFrameController = new LoginFrameController();
        loginFrameController.showLoginFrameWindow();

    }
}
