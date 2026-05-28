package com.praveen.eduflow.model;

import com.praveen.eduflow.ENUM.CourseLevel;
import com.praveen.eduflow.ENUM.CourseType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String category;

    private Double price;

    @Enumerated(EnumType.STRING)
    private CourseType courseType;

    @Enumerated(EnumType.STRING)
    private CourseLevel level;

    private String duration;

    private String thumbnailUrl;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    @OneToMany(mappedBy = "course")
    private List<Video> videos;
}