package com.javaDesign.principle.openclose;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 10:38
 **/
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java设计原则", 998d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程Id：" + javaCourse.getId() + "课程名称：" + javaCourse.getName() + "课程价格：" + javaCourse.getPrice() + "课程原价：" + javaCourse.getOriginPrice());
    }
}