package com.example.profilesAndYMLS.properties.beans;

public class MyDataSource {

    private String url;
    private String userName;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MyDataSource() {
    }

    public MyDataSource(String url, String userName, String password) {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }
}
