package Examples2;
public class Main {
    //This set of examples contains Abstraction of a class and the example usage of it
    public static void main(String[] args) {
        AnimalSounds();
    }
    public static void AnimalSounds(){
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        lion.animalSound();
        tiger.animalSound();
        lion.Sleep();
        tiger.Sleep();
    }
}
