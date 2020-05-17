package Beans;

public class BeanF implements BeanValidator {
    String name;
    int value;

    public BeanF(String name, int value) {
        this.name = name;
        this.value = value;
        System.out.println("BeanF created");
    }

    public BeanF() {

    }

    @Override
    public String toString() {
        return "BeanF name: " + name +
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
            System.out.println("BeanF is valid");
        }
    }
}
