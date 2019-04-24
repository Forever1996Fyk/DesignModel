package com.javaDesign.designModel.creational.AbstractFactory2Video;

/**
 * @program: designModel
 * @description: 课程的抽象接口
 * @author: YuKai Fan
 * @create: 2018-12-03 14:53
 **/
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}