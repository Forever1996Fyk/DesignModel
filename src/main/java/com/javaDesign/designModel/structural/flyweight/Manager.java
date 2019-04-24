package com.javaDesign.designModel.structural.flyweight;

/**
 * @program: designModel
 * @description: 部门manager
 * @author: YuKai Fan
 * @create: 2019-02-12 10:01
 **/
public class Manager implements Emplyee {
    public void report() {
        System.out.println(reportContent);
    }
    private String title = "部门经理";
    private String department;//部门
    private String reportContent;//报告内容

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}