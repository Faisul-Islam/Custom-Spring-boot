package com.suhid.practice.repository;

import com.suhid.practice.model.AddCourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddCourseRepository extends JpaRepository<AddCourseModel,String> {
}
