package com.udacity.CloudStorage.models;


public class File {

    private Integer fileID;
    private String fileName;
    private Integer userID;
    private String fileType; /// .pdf, .jpg, .java
    private byte[] fileContent;
    private String fileSize;



    public File(Integer fileID, String fileName,String fileType,Integer userID){
        this.fileID = fileID;
        this.fileName = fileName;
        this.userID = userID;
        this.fileType = fileType;



    }
    public void setFileID(Integer fileID){this.fileID = fileID;}

    public void setFileName(String fileName){this.fileName = fileName;}

    public void setUserID(Integer userID){this.userID = userID;}

    public void setFileType(String fileType){this.fileType = fileType;}

    public void setFileContent(byte[] fileContent){this.fileContent = fileContent;}

    public Integer getUserID(){return userID;}

    public Integer getFileID(){return fileID;}

    public String getFileName(){return fileName;}

    public byte[] getFileContent(){return fileContent;}






}


