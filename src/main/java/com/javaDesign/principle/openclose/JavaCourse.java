package com.javaDesign.principle.openclose;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 10:37
 **/
public class JavaCourse implements ICourse {
    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    public JavaCourse() {
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}