package com.suhid.practice.controller;

import com.suhid.practice.dto.request.SignUpRequest;
import com.suhid.practice.services.CourseService;
import com.suhid.practice.services.SignUpAndSignInServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class SignUpAndSignInController {

    private final SignUpAndSignInServices signUpAndSignInServices;
    private final CourseService courseService;


    public SignUpAndSignInController(SignUpAndSignInServices signUpAndSignInServices, CourseService courseService) {
        this.signUpAndSignInServices = signUpAndSignInServices;
        this.courseService = courseService;
    }


    @PostMapping("/signup/")
    public ResponseEntity<String> SignUp(@RequestBody SignUpRequest signUpRequest){
  return new ResponseEntity(signUpAndSignInServices.SignUp(signUpRequest), HttpStatus.CREATED);
    }
    @PutMapping("/user/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody SignUpRequest signUpRequest) {
        signUpAndSignInServices.UpdateUser(id,signUpRequest);
    }
    @GetMapping("/signin/")
    public String SignIn(){

        return "";
    }

}
