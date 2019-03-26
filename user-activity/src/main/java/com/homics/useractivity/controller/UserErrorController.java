package com.homics.useractivity.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserErrorController implements ErrorController {

    @GetMapping("/error")
    public String error() {
        return "/index.html";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
