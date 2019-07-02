package com.platformService.Controller;

import com.platformService.dao.TaskDao;
import com.platformService.model.Task;
import com.platformService.view.CustomerFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

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

    public void ShowCustomerFrameWindow() {
        customerFrame.setVisible(true);
    }

    private void initListeners() {
        updateButton.addActionListener(new UpdateButtonListener());
    }

    private void initComponents() {
        customerFrame = new CustomerFrame();
        DbTable = customerFrame.getDbTable();
        try {
            DbTable.setModel(UpdateDataTable(new TaskDao().read()));
            DbTable.setEnabled(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        descriptionField = customerFrame.getDescriptionField();
        IdField = customerFrame.getIdField();
        updateButton = customerFrame.getUpdateButton();
    }

    private String[] setTableHeader() {

        return new String[]{"ID", "Product Name", "User description", "Status"};

    }

    private DefaultTableModel UpdateTableHeader(String[] columnName) {
        DefaultTableModel dtm = new DefaultTableModel(0, 0);
        dtm.setColumnIdentifiers(columnName);
        return dtm;
    }

    private DefaultTableModel UpdateDataTable(List<Task> taskList){
        DefaultTableModel dtm = UpdateTableHeader(setTableHeader());
        List<Integer> idTask = null;
        int counter = 0;
        try {
            idTask = new TaskDao().getIdTask();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for(Task task : taskList){
            dtm.addRow(new Object[] {idTask.get(counter),task.getPorduct_name(),task.getUserDesc(),task.getIdStatus()});
            counter++;
        }


        return dtm;

    }


    private class UpdateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("test");
        }
    }
}
