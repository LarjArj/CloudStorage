package com.udacity.CloudStorage.models;
import com.udacity.CloudStorage.models.FileUploadForm;


public class File {

    private Integer fileID;
    private String fileName;
    private Integer userID;
    private String fileType; /// .pdf, .jpg, .java
    private byte[] fileData;
    private long fileSize;



    public File(Integer fileID, String fileName,String fileType,byte[] fileData,long fileSize,Integer userID){
        this.fileID = fileID;
        this.fileName = fileName;
        this.userID = userID;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.fileData = fileData;



    }
    public void setFileID(Integer fileID){this.fileID = fileID;}

    public void setFileName(String fileName){this.fileName = fileName;}

    public void setUserID(Integer userID){this.userID = userID;}

    public void setFileType(String fileType){this.fileType = fileType;}

    public void setFileContent(byte[] fileContent){this.fileData = fileData;}

    public void setFileSize(Integer fileSize){this.fileSize = fileSize;}

    public Integer getUserID(){return userID;}

    public Integer getFileID(){return fileID;}

    public String getFileName(){return fileName;}

    public byte[] getFileContent(){return fileData;}

    public long getFileSize(){return fileSize;}











}


