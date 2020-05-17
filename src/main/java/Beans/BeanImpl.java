package Beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class BeanImpl implements BeanFactoryPostProcessor {

    public void init() {
        System.out.println("BeanImpl init()");
    }
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory config) throws BeansException {
        BeanDefinition bd = config.getBeanDefinition("beanB");
        bd.setInitMethodName("junit");
  //      ((DefaultListableBeanFactory) config)
   //             .registerBeanDefinition("myBeanImpl", bd);

    }
}
