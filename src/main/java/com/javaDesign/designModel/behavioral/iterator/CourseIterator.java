package com.javaDesign.designModel.behavioral.iterator;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 15:48
 **/
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}