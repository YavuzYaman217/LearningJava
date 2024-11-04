import java.util.Arrays;

public class highchecker {

    public static int heightChecker(int[] heights) {
        if(heights.length == 0) return 0;
        int []height = new int[heights.length];
        System.arraycopy(heights, 0, height, 0, heights.length);
        Arrays.sort(height);
        int j = 0;
        for(int i = 0;i<height.length;i++){
            if(height[i] != heights[i]){
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));

    }
}
