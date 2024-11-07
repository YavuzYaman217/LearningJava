package Examples3;
public class Car extends Vehicle {
    public Car(){
        super();
    }
    public Car(String name){
        super(name);
    }

    @Override
    public void drive(){
        System.out.println("The driver "+getDriverName()+" is repairing a car");
    }
}









