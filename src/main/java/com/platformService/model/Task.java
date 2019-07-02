package com.platformService.model;

public class Task {
    private final String productName;
    private final int user_id;
    private String userDesc;
    private String serviceDesc;
    private int idStatus;

    public Task(String productName, int user_id, String userDesc, String serviceDesc, int idStatus) {
        this.productName = productName;
        this.user_id = user_id;
        this.userDesc = userDesc;
        this.serviceDesc = serviceDesc;
        this.idStatus = idStatus;
    }

    public String getPorduct_name() {
        return productName;
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

    @Override
    public String toString() {
        return this.productName + " " + this.user_id + " " + this.userDesc + " " + this.serviceDesc + this.idStatus;
    }
}
