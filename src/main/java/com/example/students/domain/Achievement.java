package com.example.students.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Achievement {
    private Integer achievementId;
    private String chinese;
    private String mathematics;
    private String englishi;
    private String averageScore;
    private String allScore;
    private Students students;
    private String acState;
    private String acStateName;
    private LocalDateTime acStateTime;
    private String acOperator;
    private LocalDateTime acOperatorTime;
    private Classh classh;

}
