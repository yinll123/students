package com.example.students.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Students {
    private Integer studentId;
    private String studentNumber;
    private String studentName;
    private Sex sex;
    private LocalDateTime dateOfBirth;
    private String address;
    private String telephone;
    private String studentState;
    private String studentStateName;
    private LocalDateTime studentStateTime;
    private String studentOperator;
    private LocalDateTime studentOperatorTime;
    private Classh classh;
    private Achievement achievement;
}
