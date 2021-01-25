package com.udacity.CloudStorage.models;

public class User {
    private Integer userID;
    private String username;
    private String password;
    private String salt;
    private String firstName;
    private String lastName;

    public User(Integer userID,String username,String password,String salt, String firstName,String lastName){
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void setUserID(Integer userId){this.userID =userId; }

    public void setUsername(String username){this.username = username;}

    public void setPassword(String password){this.password = password;}

    public void setSalt(String salt){this.salt = salt;}

    public void setFirstName(String firstName){ this.firstName = firstName;}

    public void setLastName(String lastName){this.lastName = lastName;}

    public Integer getUserID(){return userID;}

    public String getUsername(){return username;}

    public String getPassword(){return password;}

    public String getSalt(){return salt;}

    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}




}
