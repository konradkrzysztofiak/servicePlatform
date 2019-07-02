package com.platformService.model;

public class User {
    private final int userId;
    private final String userName;
    private final String password;
    private final String eMail;

    public User(int userId, String userName, String password, String eMail) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.eMail = eMail;
    }

    public User(String userName, String password, String eMail) {
        this.userName = userName;
        this.password = password;
        this.eMail = eMail;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String geteMail() {
        return eMail;
    }
}
