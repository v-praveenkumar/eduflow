package com.praveen.eduflow.controller;

import com.praveen.eduflow.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/deletestudent/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        adminService.deleteStudentAccount(id);
        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }

    @PostMapping("/deleteinstructor/{id}")
    public ResponseEntity<String> deleteInstructor(@PathVariable Long id){
        adminService.deleteInstructorAccount(id);
        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }

    @PutMapping("/suspendstudent")
    public ResponseEntity<String> suspendUser(){
        adminService.suspendStudent();
        return new ResponseEntity<>("Student Suspended", HttpStatus.OK);
    }

}
