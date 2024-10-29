import java.lang.Math;
public class IsPowerOfFour {
    public static boolean isPowerOfFour(int n) {
        return (Math.log(n) / Math.log(2)) % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(64));
    }
}
