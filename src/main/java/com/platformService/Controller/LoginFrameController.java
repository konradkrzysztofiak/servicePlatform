package com.platformService.Controller;

import com.platformService.view.LoginFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginFrameController {

    private LoginFrame loginFrame;
    private JPasswordField password;
    private JButton loginButton;
    private JTextField login;

    public LoginFrameController() {
        initComponents();
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initListeners();
    }

    private void initComponents() {
        loginFrame = new LoginFrame();
        password = loginFrame.getPassword();
        login = loginFrame.getLogin();
        loginButton = loginFrame.getLoginButton();
    }

    public void showLoginFrameWindow(){
        loginFrame.setVisible(true);
    }

    private void initListeners() {
        loginButton.addActionListener(new loginButtonListener());
    }

    private class loginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //TODO add user and password information form DB
            if(login.getText().equals("user") && Arrays.equals(password.getPassword(), "user".toCharArray())){
                JOptionPane.showMessageDialog(loginFrame,"Login success");
            } else {
                JOptionPane.showMessageDialog(loginFrame,"Login fail \n try again");

            }

        }
    }
}
