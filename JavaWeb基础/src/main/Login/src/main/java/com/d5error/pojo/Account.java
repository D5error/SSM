package com.d5error.pojo;

public class Account {
    private String username;
    private String password;

    public Account() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
