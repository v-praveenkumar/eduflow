package com.praveen.eduflow.model;

import com.praveen.eduflow.ENUM.InstructorStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Instructor {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String specialization;
    private int experience;
    private String bio;
    private String phoneNumber;
    InstructorStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
