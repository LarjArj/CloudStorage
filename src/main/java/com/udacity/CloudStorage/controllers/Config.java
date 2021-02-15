package com.udacity.CloudStorage.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
public class Config  implements WebMvcConfigurer  {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/result").setViewName("result");
        registry.addViewController("/signup").setViewName("signup");
    }


}
