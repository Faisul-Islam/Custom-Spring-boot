package com.suhid.practice.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "STUDENTS")
public class SignUpModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    private String studentName;
    private String studentId;
    private String studentPassword;
    private String studentDepartment;
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @Fetch(value = FetchMode.SUBSELECT)

}
