import java.util.Random;

public class Rand {
    public void rand() {
        Random rand = new Random();
        for(int i = 0;i < 10;i++){
            int x = rand.nextInt(6)+1;
            System.out.println(x);
        }
    }
}
