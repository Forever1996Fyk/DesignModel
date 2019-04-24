package com.javaDesign.principle.openclose;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 10:45
 **/
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}