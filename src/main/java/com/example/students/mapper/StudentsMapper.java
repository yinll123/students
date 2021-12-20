package com.example.students.mapper;



import com.example.students.domain.Students;
import com.example.students.management.StudentManagement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentsMapper {
    List<StudentManagement> findAllStudent(String  studentNumber, String studentName);
}
//学生维护管理部分的查询条件=学生编号，学生姓名，
// 查询结果=学生编号，姓名，班级，住址，年龄，语文，数学，英语 ，总成绩，平均成绩