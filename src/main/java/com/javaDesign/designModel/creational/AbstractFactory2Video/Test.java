package com.javaDesign.designModel.creational.AbstractFactory2Video;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-03 15:11
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.product();
        article.product();

    }
}