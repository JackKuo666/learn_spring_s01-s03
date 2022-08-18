package com.test.aop;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AopAdviceBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] arg, Object target) throws Throwable{
        System.out.println("通过Advice实现Aop: method = " + method + ", arg = " + Arrays.deepToString(arg) + ", target = " + target);
    }

}
