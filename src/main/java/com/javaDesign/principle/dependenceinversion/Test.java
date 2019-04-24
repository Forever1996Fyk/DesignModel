package com.javaDesign.principle.dependenceinversion;

/**
 * @program: designModel
 * @description: test属于应用层，不应该依赖student低层次模块 ，学生想学习什么都需要在Student中添加方法，然后在Test使用，扩展性比较差。
 * @author: YuKai Fan
 * @create: 2018-11-13 11:17
 **/
public class Test {
//    public static void main(String[] args) {
//        Student student = new Student();
//        student.studyFE();
//        student.studyJava();
//    }

      //接口注入
//    public static void main(String[] args) {
//        Student student = new Student();
//        student.studyStudentCourse(new JavaCourse());
//        student.studyStudentCourse(new FECourse());
//    }

    //构造器注入
//    public static void main(String[] args) {
//        Student student = new Student(new JavaCourse());
//        student.studyStudentCourse();
//
//        Student student1 = new Student(new FECourse());
//        student1.studyStudentCourse();
//    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setiCourse(new JavaCourse());
        student.studyStudentCourse();

        student.setiCourse(new FECourse());
        student.studyStudentCourse();
    }
}