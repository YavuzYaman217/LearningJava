package Examples3;

public class Vehicle {
    private String driverName;
    public  Vehicle(){
        this.driverName = "Unknown";
    }
    public Vehicle(String driverName) {
        this.driverName = driverName;
    }
    public String getDriverName() {
        return driverName;
    }

    public void drive(){
        System.out.println("The driver "+getDriverName()+" is driving the Vehicle");
    }

}
