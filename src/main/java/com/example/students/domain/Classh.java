package com.example.students.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Classh {
    private Integer classId;
    private String classNumber;
    private String className;
    private String classState;
    private String classStateNmae;
    private LocalDateTime classStateTime;
    private String classOperator;
    private LocalDateTime classOperatorTime;
    private Achievement achievement;
    private Students students;
    private String chinese;
    private String mathematics;
    private String englishi;
    //班级ID, 班级编号[CL+四位年份+两位月份+3位流水]，班级名称，记录有效状态，
    // 记录创建人，记录创建时间，最后操作人和最后操作时间）
}
