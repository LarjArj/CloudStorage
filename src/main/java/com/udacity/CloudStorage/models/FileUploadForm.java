package com.udacity.CloudStorage.models;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadForm {
    private MultipartFile uploadFile;

    public void setFile(MultipartFile uploadFileFile) {this.uploadFile = uploadFile;}

    public MultipartFile getFile() {return uploadFile;}






}
