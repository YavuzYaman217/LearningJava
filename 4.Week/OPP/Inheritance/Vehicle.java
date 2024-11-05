public class Vehicle {
    String name;
    double speed;

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
    public void go(){
        System.out.println("This vehicle("+ this.name +") is moving at "+this.speed+" KM per hour");
    }
    public void stop(){
        System.out.println("This vehicle("+ this.name +") is stopping");
    }
}
