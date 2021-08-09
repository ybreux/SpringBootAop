package com.example.demo;

import com.example.demo.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws Exception {

        final ApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
        MyService service = (MyService) context.getBean("myService");
        service.method();
    }

}
