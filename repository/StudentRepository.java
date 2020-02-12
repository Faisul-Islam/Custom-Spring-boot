package com.suhid.practice.repository;

import com.suhid.practice.model.SignUpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<SignUpModel,Long> {
}
