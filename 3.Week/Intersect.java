import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersect {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0];

        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return intersection.stream().mapToInt(i -> i).toArray();
    }


    public static void main(String[] args) {
        int []nums1 = new int[]{1,2,2,1};
        int []nums2 = new int[]{2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }
}
