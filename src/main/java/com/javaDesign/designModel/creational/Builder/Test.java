package com.javaDesign.designModel.creational.Builder;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-03 16:56
 **/
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式",
                "Java设计模式PPT",
                "Java设计模式视频",
                "Java设计模式手记",
                "Java设计模式问答");

        System.out.println(course);
    }
}