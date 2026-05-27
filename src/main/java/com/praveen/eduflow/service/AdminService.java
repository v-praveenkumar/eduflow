package com.praveen.eduflow.service;

import com.praveen.eduflow.repository.AdminRepository;
import com.praveen.eduflow.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    StudentRepository studentRepo;

    public String deleteStudentAccount(Long id){
        if(!studentRepo.existsById(id)){
            return "Record not found";
        }
        else{
            studentRepo.deleteById(id);
        }
        return "Student Account deleted";
    }
}
