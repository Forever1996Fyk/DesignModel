package com.javaDesign.principle.dependenceinversion;

/**
 * @program: designModel
 * @description: 学生类
 * @author: YuKai Fan
 * @create: 2018-11-13 11:16
 **/
public class Student {
    /*public void studyJava() {
        System.out.println("学习java");
    }

    public void studyFE() {
        System.out.println("学习前端");
    }*/

    /*public Student(ICourse iCourse) {
        this.iCourse = iCourse;
    }*/

    private ICourse iCourse;

    public void studyStudentCourse() {
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}