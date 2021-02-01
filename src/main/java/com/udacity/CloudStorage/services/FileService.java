package com.udacity.CloudStorage.services;

import com.udacity.CloudStorage.models.User;
import com.udacity.CloudStorage.models.File;
import com.udacity.CloudStorage.mappers.UserMapper;
import com.udacity.CloudStorage.mappers.FileMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;


@Service
public class FileService {

    private FileMapper fileMapper;
    private UserMapper userMapper;


    public FileService(UserMapper userMapper, FileMapper fileMapper){
        this.userMapper = userMapper;
        this.fileMapper = fileMapper;
    }

    public void addFile(MultipartFile fileUpload, Integer userID) throws IOException {
        try{

            String fileName = fileUpload.getOriginalFilename();
            String fileType=fileUpload.getContentType();
            long fileUploadSize = fileUpload.getSize();
            byte[] fileData = fileUpload.getBytes();

            fileMapper.insert(new File(0,fileName,fileType, fileData, fileUploadSize,userID));
        } catch (Exception error){
            throw error;
        }
    }

    public File getFile(String fileName){
        return fileMapper.getFile(fileName);
    }

    public File [] getAllFiles(Integer fileID){
        return fileMapper.getAllFiles(fileID);
    }

    public void deleteFile(String fileName){
        fileMapper.delete(fileName);

    }














}
