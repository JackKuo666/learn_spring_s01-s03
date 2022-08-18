package com.test.service;

import com.test.bean.Student;
import com.test.mapper.TestMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@MapperScan("com.test.mapper")  // 2.使用注解的方式
public class TestServiceImpl implements TestService{

    // 2.使用注解的方式
    @Resource
    TestMapper mapper;

    @Override
    public Student getStudent2() {
        System.out.println("2.通过注解mapper,然后mapper.getStudent()获得");
        return mapper.getStudent();
    }


    // 1.使用配置xml方式注册
    @Resource
    SqlSessionTemplate template;

    @Override
    public Student getStudent1() {
        System.out.println("1.通过配置mapper，先：template.getMapper，然后：mapper.getStudent()获得");
        TestMapper testMapper = template.getMapper(TestMapper.class);
        return testMapper.getStudent();
    }
}
