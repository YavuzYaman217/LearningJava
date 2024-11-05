package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.Setmake("Toyota");
        car.Setmodel("Supra");
        car.Setyear(2020);
        String str = Getinfo(car.Getmake(), car.Getmodel(), car.Getyear());
        System.out.println(str);
    }
    public static String Getinfo(String make, String model, int year) {
        return make + " " + model + " " + year;
    }


}
