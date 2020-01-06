package com.wenyao.springanaylize.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wenyao.springanaylize.mybatis")
public class SpringMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisApplication.class, args);

        // SqlSessionFactory sqlSessionFactory = null;
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    }


}
