# learn spring project
## s01 ioc and aop xml

- spring的IOC：控制反转（通过xml配置的方式注入到bean）
- Spring的AOP：切面编程（通过xml配置的方式）

## s02 ioc and aop annotation

- 两种通过注解方式注入bean的方式：

  1. 通过配置类（MainConfiguration）来进行添加注解：  如果要注册为Bean的类是由其他框架提供，我们无法修改其源代码，那么我们就使用第一种方式进行配置。
  
  2. 直接在类上添加注解：       如果要注册为Bean的类是我们自己编写的，我们就可以直接在类上添加注解，并在配置中添加扫描。 

## s03 mybatis xml or annotation

需要先通过当前目录下的`study.sql`新建本地mysql数据库。

- 通过xml配置mybatis的使用
- 通过注解配置mybatis的使用


参考：[spring基础](https://www.yuque.com/qingkongxiaguang/spring/rlgcf7)