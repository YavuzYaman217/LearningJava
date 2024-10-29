import java.util.Scanner;
import java.util.Scanner;
public class Input_lesson {
    public void input() {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name ? :");
        String name = sc.nextLine();

        System.out.println("What is your age ? :");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("What is your favorite food ? :");
        String food = sc.nextLine();

        System.out.println("Hello "+name);

        System.out.println("You are "+age+" years old");

        System.out.println("Your favorite food is "+food);

    }

}
