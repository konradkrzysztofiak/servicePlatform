package com.platformService.view;

import javax.swing.*;

public class CustomerFrame extends JFrame {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 500;

    private JPanel CustomerFrame;
    private JTable DbTable;
    private JTextField descriptionField;
    private JTextField IdField;
    private JButton updateButton;

    public CustomerFrame() {
        setSize(WIDTH,HEIGHT);
        setContentPane(CustomerFrame);
        setLocationRelativeTo(null);


    }

    public JPanel getCustomerFrame() {
        return CustomerFrame;
    }

    public JTable getDbTable() {
        return DbTable;
    }

    public JTextField getDescriptionField() {
        return descriptionField;
    }

    public JTextField getIdField() {
        return IdField;
    }

    public JButton getUpdateButton() {
        return updateButton;
    }
}
