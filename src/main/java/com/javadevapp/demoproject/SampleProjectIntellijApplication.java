package com.javadevapp.demoproject;

import Beans.BeanB;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class SampleProjectIntellijApplication {

    public static void main(String[] args) {

         new AnnotationConfigApplicationContext(
                BeanConfigOne.class);

    }

}
//      SpringApplication.run(SampleProjectIntellijApplication.class, args);