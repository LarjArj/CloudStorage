package com.udacity.CloudStorage.models;

public class Auth {
    private Integer authID;
    //private String key;
    private String userName;
    private String password;
    private Integer userID;
    private String URL;

    public Auth(Integer authID, String URL, String userName, String key, String password, Integer userID) {
        this.authID = authID;
        //this.key = key;
        this.userName = userName;
        this.password = password;
        this.userID = userID;
        this.URL = URL;
    }

    public void setAuthID(Integer credentialID){this.authID = authID;}

    public void setUserName(String userName){this.userName = userName;}

    public void setPassword(String password){this.password=password;}

    public void setUserID(Integer userID){this.userID=userID;}

    public void setURL(String URL){this.URL=URL;}

    public Integer getAuthID(){return authID;}

    public String getUserName(){return userName;}

    public Integer getUserID(){return userID;}

    public String getURL(){return URL;}


}
