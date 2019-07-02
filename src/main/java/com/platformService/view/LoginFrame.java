package com.platformService.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    private JPanel loginPanel;
    private JTextField login;
    private JPasswordField password;
    private JButton loginButton;

    public LoginFrame() {
        setSize(500, 500);
        setContentPane(loginPanel);
        setLocationRelativeTo(null);


    }

    public JTextField getLogin() {
        return login;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public JButton getLoginButton() {
        return loginButton;
    }
}

