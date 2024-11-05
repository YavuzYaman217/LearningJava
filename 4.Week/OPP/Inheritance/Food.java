public class Food {
    String name;
    int price;
    public Food(String name,int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return this.name + " " + this.price;
    }
}
