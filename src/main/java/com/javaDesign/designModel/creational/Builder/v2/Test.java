package com.javaDesign.designModel.creational.Builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-03 17:08
 **/
public class Test {
    public static void main(String[] args) {
        Course course= new Course.CourseBuilder().buildCourseName("Java设计模式").buildCoursePPT("Java设计模式PPT").buildCourseVideo("Java设计模式视频").buildCourseQA("Java设计模式问答").build();
        System.out.println(course);

        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();
        System.out.println(set);
    }
}