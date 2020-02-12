package com.suhid.practice.controller;

import com.suhid.practice.dto.request.AddCourseRequest;
import com.suhid.practice.services.CourseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final CourseService courseService;

    public AdminController(CourseService courseService) {
        this.courseService = courseService;
    }


    @PostMapping("/addcourse/")
    public void AddCources(@RequestBody AddCourseRequest addCourseRequest){
      courseService.AddCourse(addCourseRequest);
    }
}
