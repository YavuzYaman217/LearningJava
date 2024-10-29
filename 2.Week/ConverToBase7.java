public class ConverToBase7 {

    public static String convertToBase7(int num) {
        Integer []output = new Integer[32];
        int i = 0;
        do{
            output[i] = (num % 7);
            System.out.println(output[i]);
            i++;
            num /= 7;
        }while(num >= 1);
        return String.valueOf(output);
    }


    public static void main(String[] args) {
        convertToBase7(100);
    }
}
