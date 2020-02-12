package com.suhid.practice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "COURSES")
public class AddCourseModel {
    @Id
    private String courseId;
    private String courseName;
}
