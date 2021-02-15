package com.udacity.CloudStorage.controllers;


import com.udacity.CloudStorage.services.FileService;
import com.udacity.CloudStorage.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class FileController {

        @Autowired
        private FileService fileService;

        @GetMapping("/files/delete")
        public String deleteNote(@RequestParam("id") int fileid) {
            if (fileid > 0) {
                //fileService.deleteFile(fileid);
                return "/result-success";
            }
            return "/result-error";
        }



        @PostMapping("/files")
        public String saveFile(Authentication authentication, MultipartFile fileUpload) throws IOException {
            User currentUser = (User) authentication.getPrincipal();
            if (fileUpload.isEmpty()) {
                return "/result-error";
            }
            fileService.addFile(fileUpload, currentUser.getUserID());
            return "/result-success";
        }

}











