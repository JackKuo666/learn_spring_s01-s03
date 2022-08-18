package com.test.config;

import com.test.bean.Card;
import org.springframework.context.annotation.*;

@EnableAspectJAutoProxy
@ComponentScans({        // 2.自动扫描，然后直接在类上添加注解
        @ComponentScan("com.test.bean"),
        @ComponentScan("com.test.aop")

})
@Configuration         // 1.1.使用配置来进行注解：开启AOP注解支持
public class MainConfiguration {

    @Bean("lllll")
    @Scope("prototype")
    public Card card(){
        return new Card();
    } // 1.2.使用配置来进行注解：创建需要注解的对象，并添加@Bean注解

    /**
     * 1. 通过配置类来进行添加注解：  如果要注册为Bean的类是由其他框架提供，我们无法修改其源代码，那么我们就使用第一种方式进行配置。
     * 2. 直接在类上添加注解：       如果要注册为Bean的类是我们自己编写的，我们就可以直接在类上添加注解，并在配置中添加扫描。
     *
     * */
}
