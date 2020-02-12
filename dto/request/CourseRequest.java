package com.suhid.practice.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseRequest {
    private String subject;

    public CourseRequest() {
    }

    public CourseRequest(String subject) {
        this.subject = subject;
    }
}
