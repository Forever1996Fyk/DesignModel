package com.javaDesign.principle.demeter;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 15:33
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}