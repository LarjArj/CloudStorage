package com.udacity.CloudStorage.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping()
    public String getloginPage() {
        return "login";
    }
}
