package com.udacity.CloudStorage.models;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadForm {
    private MultipartFile File;

    public void setFile(MultipartFile File) {this.File = File;}

    public MultipartFile getFile() {return File;}


}
