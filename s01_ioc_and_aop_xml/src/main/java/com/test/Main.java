package com.test;

import com.test.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student);
        Student student2 = (Student) context.getBean("student");
        System.out.println(student2);
        student2.say();
        student2.testAOP("ssssss");
        context.close(); // 手动销毁
    }
}
