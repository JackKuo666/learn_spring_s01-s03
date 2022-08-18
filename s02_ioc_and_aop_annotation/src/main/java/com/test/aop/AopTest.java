package com.test.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component   // 1.注册为Bean
@Aspect      // 2.注册为Aspect类
public class AopTest {

    @Before("execution(* com.test.bean.Student.test(..))")
    public void before(){
        System.out.println("执行之前");
    }

    @AfterReturning(value = "execution(* com.test.bean.Student.test(..))", returning = "returnVal")
    public void after(Object returnVal){
        System.out.println("方法已返回，结果为："+returnVal);
    }
}
