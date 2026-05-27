package com.praveen.eduflow.model;

import com.praveen.eduflow.ENUM.StudentStatus;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;


@Entity
@Data
public class Student {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private StudentStatus status;
    private int age;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
