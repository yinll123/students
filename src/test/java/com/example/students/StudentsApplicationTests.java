package com.example.students;

import com.example.students.management.StudentManagement;
import com.example.students.mapper.StudentsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.List;


@SpringBootTest
class StudentsApplicationTests {

    @Autowired
    private StudentsMapper studentsMapper;
    @Test
   public void findAllStudent(){
        studentsMapper.findAllStudent("tsq", "yll");
       System.out.println(studentsMapper);
    }
}
