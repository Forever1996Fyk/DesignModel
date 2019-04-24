package com.javaDesign.designModel.behavioral.iterator;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 15:47
 **/
public interface CourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();

}