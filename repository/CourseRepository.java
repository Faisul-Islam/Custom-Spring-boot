package com.suhid.practice.repository;

import com.suhid.practice.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseModel,Long> {
}
