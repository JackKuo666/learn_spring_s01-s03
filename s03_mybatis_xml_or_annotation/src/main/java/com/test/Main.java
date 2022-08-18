package com.test;

import com.test.config.TestConfiguration;
import com.test.mapper.TestMapper;
import com.test.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("项目启动中");
        // 方法1.通过SqlSessionTemplate 来获得
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        SqlSessionTemplate template = context.getBean(SqlSessionTemplate.class);
        TestMapper testMapper = template.getMapper(TestMapper.class);
        System.out.println("通过SqlSessionTemplate来获得 = " + testMapper.getStudent());

        // 方法2
        TestService service = context.getBean(TestService.class);
        System.out.println("通过service来获得 = " + service.getStudent2());

    }
}

