public class Car {
    String make = "Toyota";
    String model = "Supra";
    int year = 2023;
    String color = "red";
    double price = 50000.15;

    @Override
    public String toString() {
        return make + " " + model + " " + year + " " + color + " " + price;
    }


    void drive(){
        System.out.println("You drive the car");
    }
    void brake(){
        System.out.println("You brake the car");
    }




}
