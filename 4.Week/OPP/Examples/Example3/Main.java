package Examples3;

public class Main {
    public static void main(String[] args) {
        Drive();
    }
    public static void Drive(){
        Car car = new Car();
        Car car2 = new Car("Harry");
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Jack");
        car.drive();
        car2.drive();
        vehicle.drive();
        vehicle2.drive();
    }
}
