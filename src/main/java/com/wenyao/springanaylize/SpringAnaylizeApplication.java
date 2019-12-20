package com.wenyao.springanaylize;

import com.wenyao.springanaylize.annotation.Annotation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan("com.wenyao")
@EnableAspectJAutoProxy
public class SpringAnaylizeApplication implements CommandLineRunner {
	@Resource
	private Annotation annotation;

	public static void main(String[] args) {
		SpringApplication.run(SpringAnaylizeApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		annotation.test(11,88);
	}
}
