package com.javaDesign.designModel.behavioral.iterator;

import java.util.List;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 15:51
 **/
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    int position;
    Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    public Course nextCourse() {
        System.out.println("返回课程,位置是: " + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    public boolean isLastCourse() {
        if (position < courseList.size()) {
            return false;
        }
        return true;
    }
}