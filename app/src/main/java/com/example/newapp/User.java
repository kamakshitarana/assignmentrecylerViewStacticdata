package com.example.newapp;

public class User {
    private String username;
    private String mobile;
    private String address;

    public User(String username, String mobile, String address) {
        this.username = username;
        this.mobile = mobile;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
