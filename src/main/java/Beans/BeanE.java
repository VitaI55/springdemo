package Beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE implements BeanValidator{
    String name;
    int value;

    public BeanE(String name, int value) {
        this.name = name;
        this.value = value;
        System.out.println("BeanE created");
    }

    public BeanE(BeanA beanA) {
        this.name = beanA.name;
        this.value = beanA.value;
        System.out.println("BeanE from BeanA was created");
    }

    @Override
    public String toString() {
        return "BeanE name: " + name +
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
            System.out.println("BeanE is valid");
        }

    }
    @PostConstruct
    public void postConst(){
        System.out.println("beanE postConstruct");
    }
    @PreDestroy
    public void preDest(){
        System.out.println("beanE preDestroy");
    }
}
