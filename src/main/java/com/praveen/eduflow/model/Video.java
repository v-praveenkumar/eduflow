package com.praveen.eduflow.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String videoUrl;

    private String duration;

    private Integer sequenceOrder;

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}