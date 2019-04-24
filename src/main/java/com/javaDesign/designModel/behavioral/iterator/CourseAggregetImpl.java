package com.javaDesign.designModel.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 15:49
 **/
public class CourseAggregetImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregetImpl() {
        this.courseList = new ArrayList();
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}