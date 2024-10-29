public class ReverseString {

    public static void reverseString(char[] s) {
        char []temp = new char[s.length];
        int j = 0;

        for (int i = s.length-1; i >= 0; i--,j++) {
            temp[j] = s[i];
        }

        System.arraycopy(temp, 0, s, 0, s.length);
    }
    public static void main(String[] args) {
        char [] s = {'H', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
}
