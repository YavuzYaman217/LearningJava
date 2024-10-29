public class toHex {
    public static  String toHex(int num) {
        return Integer.toHexString(num);
    }
    public static void main(String[] args) {
        String hex = toHex(-2);
        System.out.println(hex);
    }
}
