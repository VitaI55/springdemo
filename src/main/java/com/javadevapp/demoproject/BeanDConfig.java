package com.javadevapp.demoproject;

import Beans.BeanC;
import Beans.BeanD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class BeanDConfig {
    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
    private int value;
    @Bean(name = "beanD", initMethod = "init", destroyMethod = "destroy")
    public BeanD getBeanD(){
        return new BeanD(name,value);
    }

}
