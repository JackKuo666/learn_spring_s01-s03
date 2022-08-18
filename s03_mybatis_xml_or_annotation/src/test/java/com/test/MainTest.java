package com.test;

import com.test.config.TestConfiguration;
import com.test.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)  //方法2.通过JUnit5和SpringTest模块的注解
@ContextConfiguration(classes = TestConfiguration.class) //方法2.通过JUnit5和SpringTest模块的注解
public class MainTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        TestService service = context.getBean(TestService.class);
        System.out.println("方法1.通过创建ApplicationContext来进行测试");
        service.getStudent2();
    }

    @Autowired
    TestService service;

    @Test
    public void test(){
        System.out.println("方法2.通过JUnit5和SpringTest模块的注解");
        service.getStudent1();
    }

}
