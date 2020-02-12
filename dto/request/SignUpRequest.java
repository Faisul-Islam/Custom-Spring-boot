package com.suhid.practice.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SignUpRequest {
    private String name;
    private String id;
    private String password;
    private String dept;
    private List<String> courseList;
}
