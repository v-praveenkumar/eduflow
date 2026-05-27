package com.praveen.eduflow.service;

import com.praveen.eduflow.repository.InstructorRepository;
import com.praveen.eduflow.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    StudentRepository studentRepo;

    @Autowired
    InstructorRepository InstructorRepo;


    public String deleteStudentAccount(Long id){
        if(!studentRepo.existsById(id)){
            return "Record not found";
        }
        else{
            studentRepo.deleteById(id);
        }
        return "Student Account deleted";
    }

    public String deleteInstructorAccount(Long id){
        if(!InstructorRepo.existsById(id)){
            return "Record not found";
        }
        else{
            InstructorRepo.deleteById(id);
        }
        return "Student Account deleted";
    }
}
