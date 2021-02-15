package com.udacity.CloudStorage.controllers;

import com.udacity.CloudStorage.models.User;
import com.udacity.CloudStorage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public String register(@ModelAttribute("SpringWeb") User currentUser) {
        if (currentUser == null) {
            return "redirect:signup";
        }

        try {
            userService.CreateUser(currentUser);
        } catch (Exception e) {
            return "redirect:signup?error";
        }

        return "redirect:signup?success";
    }



}
