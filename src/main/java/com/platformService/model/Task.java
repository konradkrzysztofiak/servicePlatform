package com.platformService.model;

public class Task {
    private final String porductName;
    private final int user_id;
    private String userDesc;
    private String serviceDesc;
    private int idStatus;

    public Task(String porductName, int user_id, String userDesc, String serviceDesc, int idStatus) {
        this.porductName = porductName;
        this.user_id = user_id;
        this.userDesc = userDesc;
        this.serviceDesc = serviceDesc;
        this.idStatus = idStatus;
    }

    public String getPorduct_name() {
        return porductName;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public int getIdStatus() {
        return idStatus;
    }
}
