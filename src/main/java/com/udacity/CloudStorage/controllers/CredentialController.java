package com.udacity.CloudStorage.controllers;

import com.udacity.CloudStorage.models.UserCredential;
import com.udacity.CloudStorage.models.User;
import com.udacity.CloudStorage.services.CredentialService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CredentialController {

    @Autowired
    private CredentialService credentialService;


    @GetMapping("/credentials/delete")
    public String deleteNote(@RequestParam("id") int credentialid) {
        if (credentialid > 0) {
            credentialService.deleteCredential(credentialid);
            return "/result-success";
        }
        return "/result-error";
    }

    @PostMapping("/credentials")
        public String saveOrUpdateCredentials(Authentication authentication, UserCredential credential) {
        User user = (User) authentication.getPrincipal();
        if (credential.getCredentialID() > 0) {
            //credentialService.updateCredential(credential);
        }
        else {
            //credentialService.addCredential(credential, user.getUserID());
        }
        return "/result-success";
    }
}
