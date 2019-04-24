package com.javaDesign.designModel.creational.AbstractFactory2Video;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-03 15:03
 **/
public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}