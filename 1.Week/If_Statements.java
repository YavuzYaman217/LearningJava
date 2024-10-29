import java.util.Scanner;

public class If_Statements {
    public void statement() {
        int age = 12;
        if (age >= 75) {
            System.out.println("You are above 75");
        } else if (age >= 18) {
            System.out.println("You are above 18");
        } else {
            System.out.println("You are not above 18");
        }
    }

    public  void statement2() {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age;
        while(name.isBlank()){
            System.out.println("Enter your name");
            name = sc.nextLine();
        }
        System.out.println("Your name is " + name);

        do{
            System.out.println("Enter your age");
            age = sc.nextInt();
        }while (age == 0);
        System.out.println("Your age is " + age);
    }
}
