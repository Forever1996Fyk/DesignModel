package com.javaDesign.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 15:29
 **/
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }
}