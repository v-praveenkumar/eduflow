package com.praveen.eduflow.repository;

import com.praveen.eduflow.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}
