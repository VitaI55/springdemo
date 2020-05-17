package Beans;

public class BeanB implements BeanValidator{
    String name;
    int value;

    public void init(){
        System.out.println("BeanB initialized");
    }

    public void junit(){
        System.out.println("BeanB Juinitialized");
    }
    private void destroy(){
        System.out.println("BeanB destroyed");
    }

    public BeanB(String name, int value) {
        this.name = name;
        this.value = value;
        System.out.println("BeanB created name:" + name + "-" + value);
    }

    @Override
    public String toString() {
        return "BeanB name: " + name +
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
            System.out.println("BeanB is valid");
        }
    }
}
