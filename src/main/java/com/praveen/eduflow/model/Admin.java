package com.praveen.eduflow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue
    Long id;
    String username;
    String firstName;
    String lastName;
    String password;
    String email;
    LocalDateTime createdAt;
}
