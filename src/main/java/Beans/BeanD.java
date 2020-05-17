package Beans;

public class BeanD implements BeanValidator{
    String name;
    int value;

    private void init(){
        System.out.println("BeanD initialized");
    }

    private void destroy(){
        System.out.println("BeanD destroyed");
    }

    public BeanD(String name, int value) {
        this.name = name;
        this.value = value;
        System.out.println("BeanD created");
    }

    @Override
    public String toString() {
        return "BeanD name: " + name +
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
            System.out.println("BeanD is valid");
        }
    }
}
