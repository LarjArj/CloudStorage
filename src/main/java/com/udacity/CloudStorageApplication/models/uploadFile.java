package com.udacity.CloudStorageApplication.models;

public class uploadFile {
    private int fileID;
    private String fileName;
    private int userID;
    private String fileType; /// .pdf, .jpg, .java
    private String fileSize;



    public uploadFile(int fileID, String fileName,int userID){
        this.fileID = fileID;
        this.fileName = fileName;
        this.userID = userID;


    }

    public void setFileID(int fileID){this.fileID = fileID;}

    public void setFileName(String fileName){this.fileName = fileName;}

    public void setUserID(int userID){this.userID = userID;}

    public int getUserID(int userID){return userID;}

    public int getFileID(int fileID){return fileID;}

    public String getFileName(String fileName){return fileName;}


    }


