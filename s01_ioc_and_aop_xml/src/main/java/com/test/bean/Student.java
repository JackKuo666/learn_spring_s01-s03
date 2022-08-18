package com.test.bean;

import java.util.Map;

public class Student {
    String name;
    int age;
    Card card;
    Map<String, Double> map;

    private void init(){
        System.out.println("初始化方法！");
    }

    public Student(){
        System.out.println("构造了");
    }

    private void destroy(){
        System.out.println("销毁方法");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCard(Card card){
        this.card = card;
    }

    public void say(){
        System.out.println("我是："+name);
    }

    public void setMap(Map<String, Double> map) {
        this.map = map;
    }

    public int testAOP(String str){
        System.out.println("str = " + str);
        return str.length();
    }
}
