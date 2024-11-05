public class Cat extends Animal {
    String can_meow = "meow";
    public Cat(String name) {
        super(name);
    }
    @Override
    public void speaks(){
        System.out.println("The animal("+ this.name+") goes '"+this.can_meow+"'");
    }
}
