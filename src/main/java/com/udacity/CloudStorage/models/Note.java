package com.udacity.CloudStorage.models;

public class Note {
    private Integer noteID;
    private String title;
    private String description;
    private Integer userID;

    public Note(Integer noteID, String title, String description, int userID){
        this.noteID = noteID;
        this.title = title;
        this.description = description;
        this.userID = userID;

    }

    public void setNoteID(Integer noteID){ this.noteID = noteID;}

    public void setTitle(String title){ this.title = title;}

    public void setDescription(String description){this.description = description;}

    public void setUserID(int userID){this.userID = userID;}

    public int getNoteID (){return noteID;}

    public String getDescription () {return description;}

    public Integer getUserID() {return userID;}




}
