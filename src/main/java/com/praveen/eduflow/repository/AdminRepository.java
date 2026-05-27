package com.praveen.eduflow.repository;

import com.praveen.eduflow.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
