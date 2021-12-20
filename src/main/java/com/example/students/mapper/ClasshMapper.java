package com.example.students.mapper;

import com.example.students.domain.Classh;
import com.example.students.management.ClasshManagement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClasshMapper {
    List<ClasshManagement> findAllClassh(String classId, String className);
}
//班级维护管理部分的查询条件=班级编号，班级名称，
// 查询结果=班级编号，班级名称，语文平均成绩，数学平均成绩，英语平均成绩，
// 总平均成绩（如果学生缺考，该科成绩=NULL，不要计算到学生的平均成绩中）