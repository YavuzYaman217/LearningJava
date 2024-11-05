package Encapsulation;

public class Car {
    private String make;
    private String model;
    private int year;

    public void Setmake(String make){
        this.make = make;
    }
    public void Setmodel(String model){
        this.model = model;
    }
    public void Setyear(int year){
        this.year = year;
    }
    public String Getmake(){
        return this.make;
    }
    public String Getmodel(){
        return this.model;
    }
    public int Getyear(){
        return this.year;
    }

}
