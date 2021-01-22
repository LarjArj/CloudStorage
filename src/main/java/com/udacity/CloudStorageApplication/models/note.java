package com.udacity.CloudStorageApplication.models;

public class note {
    private int noteID;
    private String title;
    private String description;
    private int userID;

    public note(int noteId, String title, String description, int userID){
        this.noteID = noteId;
        this.title = title;
        this.description = description;
        this.userID = userID;

    }

    public void setNoteId(int noteID){ this.noteID = noteID;}

    public void setTitle(String title){ this.title = title;}

    public void setDescription(String description){this.description = description;}

    public void setUserID(int userID){this.userID = userID;}

    public int getNoteID (){return noteID;}

    public String getDescription () {return description;}

    public int getUserID() {return userID;}




}
