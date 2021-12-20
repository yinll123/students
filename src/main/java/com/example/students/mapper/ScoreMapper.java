package com.example.students.mapper;


import com.example.students.domain.Classh;
import com.example.students.domain.Students;
import com.example.students.management.AchievementManagement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScoreMapper {
    List<AchievementManagement> findAllScore(String studentName, String className, String score);
}
//成绩维护管理部分的查询条件=学生姓名，班级名称，平均成绩【范围条件，包含开始结束】，班级和姓名实现选择班级级联姓名，
// 查询结果=学生姓名，班级，科目，科目成绩，如果学生缺考，则该科成绩=NULL显示为空