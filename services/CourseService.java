package com.suhid.practice.services;

import com.suhid.practice.dto.request.AddCourseRequest;
import com.suhid.practice.model.AddCourseModel;
import com.suhid.practice.repository.AddCourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final AddCourseRepository addCourseRepository;

    public CourseService(AddCourseRepository addCourseRepository) {
        this.addCourseRepository = addCourseRepository;
    }


    public void AddCourse(AddCourseRequest addCourseRequest){
        AddCourseModel addCourseModel = new AddCourseModel();
        addCourseModel.setCourseId(addCourseRequest.getCourseId());
        addCourseModel.setCourseName(addCourseRequest.getCourseName());
        addCourseRepository.save(addCourseModel);
    }
}
