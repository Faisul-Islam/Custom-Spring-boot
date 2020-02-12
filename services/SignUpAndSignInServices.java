package com.suhid.practice.services;

import com.suhid.practice.dto.request.SignUpRequest;
import com.suhid.practice.model.CourseModel;
import com.suhid.practice.model.SignUpModel;
import com.suhid.practice.repository.AddCourseRepository;
import com.suhid.practice.repository.CourseRepository;
import com.suhid.practice.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SignUpAndSignInServices {
      private final StudentRepository studentRepository;
      private final AddCourseRepository addCourseRepository;
      private final CourseRepository courseRepository;

    public SignUpAndSignInServices(StudentRepository studentRepository, AddCourseRepository addCourseRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.addCourseRepository = addCourseRepository;
        this.courseRepository = courseRepository;
    }

    public String SignUp(SignUpRequest signUpRequest){

//        List<CourseModel> courseList = new ArrayList();
//        for(CourseRequest courseRequest:signUpRequest.getCourseList()){
//            CourseModel courseModel = new CourseModel();
//            courseModel.setSubject(courseRequest.getSubject());
//            courseList.add(courseModel);
//        }

        List<String> courseList = signUpRequest.getCourseList();
        String id = signUpRequest.getId();
        //List<CourseModel> courseModels = new ArrayList();
        for(int i = 0;i<courseList.size();i++){
           CourseModel courseModel = new CourseModel();
           courseModel.setStudentId(signUpRequest.getId());
           courseModel.setSubject(addCourseRepository.findById(courseList.get(i)).get().getCourseName());
            courseRepository.save(courseModel);

        }


        SignUpModel signUpModel = new SignUpModel();
        signUpModel.setStudentName(signUpRequest.getName());
        signUpModel.setStudentId(id);
        signUpModel.setStudentDepartment(signUpRequest.getDept());
        signUpModel.setStudentPassword(signUpRequest.getPassword());
        studentRepository.save(signUpModel);

        return "";
    }

    public void UpdateUser(Long id,SignUpRequest signUpRequest) {
        Optional<SignUpModel> optionalSignUpModel = studentRepository.findById(id);
        if(!optionalSignUpModel.isPresent()){
            throw new ResourceAccessException("User Not found");
        }
        SignUpModel signUpModel = optionalSignUpModel.get();

//        List<CourseModel> courseList = signUpModel.getCourseModels();
//        for(CourseRequest courseRequest:signUpRequest.getCourseList()){
//            CourseModel courseModel = new CourseModel();
//            courseModel.setSubject(courseRequest.getSubject());
//            courseList.remove(courseModel);
//        }
//
//        signUpModel.setStudentName(signUpRequest.getName());
//        signUpModel.setStudentId(signUpRequest.getId());
//        signUpModel.setStudentDepartment(signUpRequest.getDept());
//        signUpModel.setStudentPassword(signUpRequest.getPassword());
//        signUpModel.setCourseModels(courseList);
       // studentRepository.deleteById(signUpModel.getCourseModels();
        studentRepository.save(signUpModel);
    }


}
