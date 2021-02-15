package com.udacity.CloudStorage.models;

public class UserCredential {
    private Integer credentialID;
    //private String key;
    private String userName;
    private String password;
    private Integer userID;
    private String URL;

    public UserCredential(Integer credentialID, String URL, String userName, String password, Integer userID) {
        this.credentialID = credentialID;
        //this.key = key;
        this.userName = userName;
        this.password = password;
        this.userID = userID;
        this.URL = URL;
    }

    public void setCredentialID(Integer credentialID){this.credentialID = credentialID;}

    public void setUserName(String userName){this.userName = userName;}

    public void setPassword(String password){this.password=password;}

    public void setUserID(Integer userID){this.userID=userID;}

    public void setURL(String URL){this.URL=URL;}

    public Integer getCredentialID(){return credentialID;}

    public String getUserName(){return userName;}

    public Integer getUserID(){return userID;}

    public String getURL(){return URL;}


}
