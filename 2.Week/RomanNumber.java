import java.util.Scanner;
public class RomanNumber {

    public static int romanToInt(String s) {
        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = ValueofRoman(s.charAt(i));
            if (i < n - 1 && current < ValueofRoman(s.charAt(i + 1))) {
                result -= current;
            }else {
                result += current;
            }
        }
        return result;
    }

    private static int ValueofRoman(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roman number: ");
        String s = sc.next();
        s = s.trim();
        s = s.toUpperCase();
        System.out.println(romanToInt(s));
    }

}
