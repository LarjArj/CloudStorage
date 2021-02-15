package com.udacity.CloudStorage.controllers;

import org.springframework.web.servlet.ModelAndView;
import com.udacity.CloudStorage.models.User;
import com.udacity.CloudStorage.services.CredentialService;
import com.udacity.CloudStorage.services.FileService;
import com.udacity.CloudStorage.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {



    @Autowired
    private CredentialService credentialService;

    @Autowired
    private NoteService noteService;

    @Autowired
    private FileService fileService;

    @GetMapping(value = {"/home"})
    public ModelAndView getHomePage(Authentication authentication) throws  Exception {
        User user = (User) authentication.getPrincipal();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("files", fileService.getAllFiles(user.getUserID()));
        modelAndView.addObject("notes", noteService.getAllNotes(user.getUserID()));
        modelAndView.addObject("credentials", credentialService.getAllCredentials(user.getUserID()));

        return modelAndView;
    }
}








//import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
//package com.udacity.CloudStorage.controllers;
//
//import org.springframework.stereotype.Controller;
//package com.udacity.CloudStorage.controllers;
//
//import org.springframework.stereotype.Controller;
//
//import com.udacity.CloudStorage.models.User;
//import com.udacity.CloudStorage.models.Note;
//import com.udacity.CloudStorage.models.File;
//import com.udacity.CloudStorage.models.userCredential;
//import com.udacity.CloudStorage.services.UserService;
//import com.udacity.CloudStorage.services.FileService;
//import com.udacity.CloudStorage.services.EncryptionService;
//import com.udacity.CloudStorage.services.NoteService;
//import com.udacity.CloudStorage.services.CredentialService;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.security.core.Authentication;
//import java.util.*;
//import org.springframework.ui.Model;
//
//import javax.naming.AuthenticationException;
//
//@Controller
//@RequestMapping("/home")
//public class HomeController {
//
//    private final FileService fileService;
//    private final UserService userService;
//    private final NoteService noteService;
//    private final CredentialService credentialService;
//    private final EncryptionService encryptionService;
//
//
//    public HomeController (UserService userService,FileService fileService,NoteService noteService,CredentialService credentialService, EncryptionService encryptionService){
//        this.userService = userService;
//        this.fileService = fileService;
//        this.credentialService = credentialService;
//        this.encryptionService = encryptionService;
//        this.noteService = noteService;
//
//    }
//
//    @GetMapping("/home")
//    public String getHomePage(Authentication authentication,
//                              @ModelAttribute("newFileUpload") File newFileUpload,@ModelAttribute("newUserCred") userCredential newUserCred,
//                             @ModelAttribute("noteForm") Note noteForm,Model model){
//
//        Integer userID = getUserID(authentication);
//        model.addAttribute("credentials", credentialService.getAllCredentials(userID));
//        model.addAttribute("files", fileService.getAllFiles(userID));
//        model.addAttribute("notes",noteService.getAllNotes(userID));
//        model.addAttribute("encryptionService", encryptionService);
//
//        return "home";
//    }
//
//    @PostMapping()
//    public String addNewFile(Authentication authentication,
//                             @ModelAttribute("newUserCred") userCredential newUserCred,
//                             @ModelAttribute("newFileUpload") File newFileUpload,
//                             @ModelAttribute("noteForm") Note noteForm,Model model){
//        Integer userID = getUserID(authentication);
//        model.addAttribute("files", fileService.getAllFiles(userID));
//
//        return "result";
//    }
//
//
//
//    public  Integer getUserID(Authentication authentication){
//        String userName = authentication.getName();
//        User user  = userService.getUser(userName);
//        return user.getUserID();
//    }




//}
