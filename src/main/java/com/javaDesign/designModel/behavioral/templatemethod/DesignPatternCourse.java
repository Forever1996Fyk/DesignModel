package com.javaDesign.designModel.behavioral.templatemethod;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 14:55
 **/
public class DesignPatternCourse extends ACourse {
    void packageCourse() {
        System.out.println("提供课程java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}