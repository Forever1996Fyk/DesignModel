package com.javaDesign.principle.dependenceinversion;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 11:20
 **/
public class JavaCourse implements ICourse {
    public void studyCourse() {
        System.out.println("学生学习java课程");
    }
}