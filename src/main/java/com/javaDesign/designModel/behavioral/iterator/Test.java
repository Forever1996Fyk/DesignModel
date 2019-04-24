package com.javaDesign.designModel.behavioral.iterator;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 15:53
 **/
public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("Java电商一期");
        Course course2 = new Course("Java电商二期");
        Course course3 = new Course("Java设计模式");
        Course course4 = new Course("Python课程");
        Course course5 = new Course("算法课程");
        Course course6 = new Course("前端课程");

        CourseAggregate courseAggreget = new CourseAggregetImpl();

        courseAggreget.addCourse(course1);
        courseAggreget.addCourse(course2);
        courseAggreget.addCourse(course3);
        courseAggreget.addCourse(course4);
        courseAggreget.addCourse(course5);
        courseAggreget.addCourse(course6);

        System.out.println("----课程列表----");
        printCourses(courseAggreget);

        courseAggreget.removeCourse(course4);
        courseAggreget.removeCourse(course5);

        System.out.println("----删除操作之后的课程列表----");
        printCourses(courseAggreget);
    }

    public static void printCourses(CourseAggregate courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}