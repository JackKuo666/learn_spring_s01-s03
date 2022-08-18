package com.test.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Scope("prototype")
public class Student {
    String name;
    int age;

    @Resource
    Card card;

    public int test(String str){
        System.out.println("我被调用了 str = " + str);
        return str.length();
    }
}