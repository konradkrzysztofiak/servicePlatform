package com.platformService.Controller;

import com.platformService.view.CustomerFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerFrameController {
    private CustomerFrame customerFrame;
    private JTable DbTable;
    private JTextField descriptionField;
    private JTextField IdField;
    private JButton updateButton;

    public CustomerFrameController() {
        initComponents();
        customerFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initListeners();
    }

    public void ShowCustomerFrameWindow(){
        customerFrame.setVisible(true);
    }

    private void initListeners() {
        updateButton.addActionListener(new UpdateButtonListener());
    }

    private void initComponents() {
        customerFrame = new CustomerFrame();
        DbTable = customerFrame.getDbTable();
        DbTable.setModel(fillTable());
        descriptionField = customerFrame.getDescriptionField();
        IdField = customerFrame.getIdField();
        updateButton = customerFrame.getUpdateButton();
    }

    private DefaultTableModel fillTable(){
        DefaultTableModel model = new DefaultTableModel();;

        model.addColumn("Col1");
        model.addColumn("Col2");

        return model;
    }

    private class UpdateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("test");
        }
    }
}
