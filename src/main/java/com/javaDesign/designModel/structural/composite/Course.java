package com.javaDesign.designModel.structural.composite;

/**
 * @program: designModel
 * @description: 课程类
 * @author: YuKai Fan
 * @create: 2019-02-12 11:39
 **/
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + name + "Price:" + price);
    }
}