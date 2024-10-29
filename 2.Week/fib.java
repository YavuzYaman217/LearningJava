public class fib {
    public static int fib(int n) {
        /*int sum;
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        sum = fib(n-1) + fib(n-2);
        return sum;*/

        int []arr = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];

    }

    public static void main(String[] args) {
        int x = fib(4);
        System.out.println(x);

    }

}
