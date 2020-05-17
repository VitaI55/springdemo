package com.javadevapp.demoproject;

import Beans.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
@Import({BeanBConfig.class, BeanCConfig.class,
        BeanDConfig.class})
public class BeanConfigOne {

    @Bean(name = "beanA1")
    public BeanA getBeanA1(BeanB b, BeanC c){
        return new BeanA(b,c);
    }

    @Bean(name = "beanA2")
    public BeanA getBeanA2(BeanB b, BeanD d){
        return new BeanA(b,d);
    }

    @Bean(name = "beanA3")
    public BeanA getBeanA3(BeanC c, BeanD d){
        return new BeanA(c,d);
    }

    @Bean
    public BeanE getBeanE1(@Qualifier("beanA1") BeanA beanA1){
        return new BeanE(beanA1);
    }

    @Bean
    public BeanE getBeanE2(@Qualifier("beanA2") BeanA beanA2){
        return new BeanE(beanA2);
    }

    @Bean
    public BeanE getBeanE3(@Qualifier("beanA3") BeanA beanA3){
        return new BeanE(beanA3);
    }

    @Bean
    @Lazy
    public BeanF getBeanF(){
        return new BeanF();
    }

    @Bean(initMethod = "init")
    public BeanImpl getBeanImpl(){
        return new BeanImpl();
    }

    @Bean()
    public BeanImplProc getBeanImplProc(){
        return new BeanImplProc();
    }
}
