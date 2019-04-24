package com.javaDesign.designModel.creational.AbstractFactory2Video;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-03 15:06
 **/
public class PythonCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}