public class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void speaks(){
        System.out.println("The animal("+ this.name+") speaks");
    }
}
