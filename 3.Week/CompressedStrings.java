public class CompressedStrings {
    public static String compressedString(String word) {
        if (word.isEmpty()) return word;
        StringBuilder comp = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            int count = 1;
            while (i + 1 < word.length() && word.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            while (count > 9) {
                comp.append(9).append(currentChar);
                count -= 9;
            }
            comp.append(count).append(currentChar);
        }
        return comp.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressedString("aaaaaaaaaaaaaabbbbbbbbbbbbbbbbeeeeeeeeee"));
    }
}
