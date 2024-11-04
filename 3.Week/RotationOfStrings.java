public class RotationOfStrings {

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String my_new = s+s;
        for(int i = 0; i < s.length(); i++) {
            if(my_new.substring(i,s.length()+i).equals(goal)) return true;
        }
        return false;

    }

    /* OR YOU CAN USE rotateString2 INSTEAD OF ABOVE rotateString */


    public  static  boolean rotateString2(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String str = s+s;
        return str.contains(goal);
    }


    public static void main(String[] args) {
        System.out.println(rotateString("abcde","abced"));
        System.out.println(rotateString2("abcde","abced"));

    }
}
