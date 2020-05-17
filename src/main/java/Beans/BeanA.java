package Beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class BeanA implements BeanValidator, InitializingBean, DisposableBean {
    String name;
    int value;
    @Value("Andrew")
    public void setName(String name) {
        this.name = name;
        System.out.println("BeanA name =" + name);
    }


    public BeanA(String name, int value) {
        this.name = name;
        this.value = value;
        System.out.println("BeanA created name:" + name + "-" + value);
    }

    public BeanA(BeanB b, BeanC c) {
        this.name = b.name;
        this.value = c.value;
        System.out.println("BeanA from BeanB and BeanC");
    }

    public BeanA(BeanB b, BeanD d) {
        this.name = d.name;
        this.value = b.value;
        System.out.println("BeanA from BeanB and BeanD");
    }

    public BeanA(BeanC c, BeanD d) {
        this.name = c.name;
        this.value = d.value;
        System.out.println("BeanA from BeanC and BeanD");
    }

    @Override
    public String toString() {
        return "BeanA name: " + name +
                "; value: " + value;
    }

    @Override
    public void validate() {
        if(this.name == null){
            System.out.println("Why tha fuck this is null: " + this.name);
            if(this.value <=0){
                System.out.println("Why the fuck this is <= then zero?: " + this.value);
            }
            else{
            }
        }
        else{
            System.out.println("BeanA is valid");
        }

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("beanA was destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("beanA after propertiesSet works");
    }
}
