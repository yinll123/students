package com.example.students.management;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class StudentManagement {
    private Integer studentNumber;
    private String studentName;
    private Integer classId;
    private String classNumber;
    private String className;
    private String address;
    private LocalDateTime dateOfBirth;
    private String chinese;
    private String mathematics;
    private String englishi;
    private String allScore;
    private String averageScore;
}
//学生编号，姓名，班级，住址，年龄，语文，数学，英语 ，总成绩，平均成绩
