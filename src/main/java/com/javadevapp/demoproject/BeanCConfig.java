package com.javadevapp.demoproject;

import Beans.BeanC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class BeanCConfig {
    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private int value;
    @Bean(name = "beanC", initMethod = "init", destroyMethod = "destroy")
    @DependsOn("beanB")
    public BeanC getBeanC(){
        return new BeanC(name,value);
    }

}
