package com.javaDesign.designModel.behavioral.templatemethod;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 14:57
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---");
        ACourse designPatternCourse = new DesignPatternCourse();
        //这里涉及到的钩子方法，其实是子类重写父类方法的一些基础规则，子类调用父类的方法，如果是被重写的，那调用的其实是子类重写过后的方法
        //也就是说，子类重写了父类的needWriteArticle()方法，在调用父类的makeCourse()时，调用了needWriteArticle()其实是子类重写的方法，也就是返回了true
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end---");

        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");

    }
}