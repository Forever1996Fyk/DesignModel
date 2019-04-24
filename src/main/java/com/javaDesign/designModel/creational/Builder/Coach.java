package com.javaDesign.designModel.creational.Builder;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-03 16:52
 **/
public class Coach {
    private CourseBuilder courseBuilder;

    //通过set注入，传入的课程建造的值
    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    //课程建造方法
    public Course makeCourse(String courseName,
                             String coursePPT,
                             String courseVideo,
                             String courseArticle,
                             String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}