package com.praveen.eduflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EduFlowController {
    @GetMapping("/")
    public String HomePage(){
        return "Hello welcome to home";
    }
}
