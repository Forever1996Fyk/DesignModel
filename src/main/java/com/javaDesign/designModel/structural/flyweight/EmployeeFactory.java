package com.javaDesign.designModel.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: designModel
 * @description: 员工工厂
 * @author: YuKai Fan
 * @create: 2019-02-12 10:04
 **/
public class EmployeeFactory {
    //因为在享元模式中，一般要考虑线程安全问题，但是还是要看业务场景来使用
    private static final Map<String, Emplyee> EMPLYEE_MAP = new HashMap<String, Emplyee>();

    public static Emplyee getManager(String department) {
        Manager manager = (Manager) EMPLYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建部门经理：" + department);
            String reportContent = department + "部门汇报：此次报告的主要内容是。。。。";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告：" + reportContent);
            EMPLYEE_MAP.put(department, manager);
        }
        return manager;
    }
}