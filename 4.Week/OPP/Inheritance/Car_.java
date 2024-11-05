public class Car_ {
    String name;
    String color;
    static int count = 0;

    Car_(String name,String color){
        this.name=name;
        this.color=color;
    }
    public String toString(){
        return this.name+" "+'('+this.color+')';
    }
    public static int getCount(){
        count++;
        return count;
    }

}
