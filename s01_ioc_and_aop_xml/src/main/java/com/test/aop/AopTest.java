package com.test.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public class AopTest {
    //执行之后的方法
    public void after(){
        System.out.println("我是执行之后");
    }

    //执行之前的方法
    public void before(JoinPoint point){
        System.out.println("我是执行之前");
        System.out.println("point = " + point.getTarget());
        System.out.println("point = " + Arrays.toString(point.getArgs()));
    }

    //环绕方法
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕方法：方法开始之前");
        String arg = joinPoint.getArgs()[0] + "伞兵一号";
        Object value = joinPoint.proceed(new Object[]{arg});
        System.out.println("方法执行完成，结果为 " + value);
        return value;
    }

}
