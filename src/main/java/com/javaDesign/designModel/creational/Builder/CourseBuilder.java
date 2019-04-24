package com.javaDesign.designModel.creational.Builder;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-03 16:48
 **/
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    //上面的都属于课程的组件，这个方法时课程的建造
    public abstract Course makeCourse();
}