package com.javaDesign.designModel.creational.Prototype;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-13 16:20
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:" + mail);
        for (int i = 0; i < 10; i++) {
            //克隆的时候，并不会使用原对象的构造器
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@qq.com");
            mailTemp.setContent("恭喜您，中奖了");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}