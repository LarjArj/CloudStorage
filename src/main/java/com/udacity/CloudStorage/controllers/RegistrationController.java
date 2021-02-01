package com.udacity.CloudStorage.controllers;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.udacity.CloudStorage.models.User;
import com.udacity.CloudStorage.services.UserService;

import org.springframework.web.bind.annotation.*;


@Controller()
@RequestMapping("/register")
public class RegistrationController {

    private final UserService userService;
    public RegistrationController(UserService userService) {
        this.userService = userService;

    }



    @GetMapping()
    public String getLoginPage(){
        return "register";

    }

    @PostMapping()
    public String registerUser(@ModelAttribute User user,Model model){


        if (userService.isUsernameValid(user.getUsername())){
            model.addAttribute("registraion_successful", true);
        }

        else {
            model.addAttribute("registration_error", "Username already exists");
        }

        return "string";
    }



}
