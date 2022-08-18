package com.test;


import com.test.bean.Card;
import com.test.bean.Student;
import com.test.config.MainConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Card card = context.getBean(Card.class);
        System.out.println(card);
        Card card2 = (Card) context.getBean("lllll");
        System.out.println(card2);

        Student student = context.getBean(Student.class);
        System.out.println(student);
        student.test("qqqqq");

    }
}
