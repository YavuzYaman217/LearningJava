import java.util.Scanner;
public class Loops {

    public void Floop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    public void NestedLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int rows = sc.nextInt();
        System.out.println("Enter column number: ");
        int cols = sc.nextInt();
        System.out.println("Enter symbol to use: ");
        String symbol = sc.next();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public void Arrayloops() {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void Arrayloops2D() {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.next();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
        }

    }
}
