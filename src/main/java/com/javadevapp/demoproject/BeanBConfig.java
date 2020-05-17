package com.javadevapp.demoproject;

import Beans.BeanB;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class BeanBConfig {
    @Value("${beanB.name}")
    private String name;
    @Value("${beanB.value}")
    private int value;
    @Bean(name = "beanB", initMethod = "init", destroyMethod = "destroy")
    @DependsOn("beanD")
    public BeanB getBeanB(){
        return new BeanB(name,value);
    }

}
