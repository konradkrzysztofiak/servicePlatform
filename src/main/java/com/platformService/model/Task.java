package com.platformService.model;

public class Task {
    private final String porduct_name;
    private final int user_id;
    private final String userDesc;
    private final String serviceDesc;
    private  int idStatus;

    public Task(String porduct_name, int user_id, String userDesc, String serviceDesc, int idStatus) {
        this.porduct_name = porduct_name;
        this.user_id = user_id;
        this.userDesc = userDesc;
        this.serviceDesc = serviceDesc;
        this.idStatus = idStatus;
    }

    public String getPorduct_name() {
        return porduct_name;
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
