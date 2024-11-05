import java.util.Random;
public class Diceroller {

    Random rand;
    int number;

     void DiceRoller(){
         rand = new Random();
        int number = 0;
        roll(/*rand,number*/);
    }

    private void roll(/*Random rand,int number*/){
         number = rand.nextInt(6)+1;
         System.out.println(number);
    }


}
