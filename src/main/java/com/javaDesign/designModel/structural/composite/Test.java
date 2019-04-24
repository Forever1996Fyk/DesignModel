package com.javaDesign.designModel.structural.composite;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-12 11:47
 **/
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 15);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程",2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期", 55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期", 66);
        CatalogComponent designPattern = new Course("Java设计模式", 77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent mainCourseCatalog = new CourseCatalog("课程主目录",1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();


    }
}