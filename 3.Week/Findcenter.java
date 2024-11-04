import java.util.Arrays;

public class Findcenter {
    public static int findCenter(int[][] edges) {
        if(edges.length == 0) return -1;
        int []temp = new int[edges.length*2];
        int k = 0;
        for (int[] edge : edges) {
            for (int j = 0; j < edge.length; j++) {
                temp[k++] = edge[j];
            }
        }
        Arrays.sort(temp);
        for(int i = 0; i < temp.length-1; i++){
            if(temp[i] == temp[i+1]){
                return i+1;
            }
        }
        return -1;
    }

    public  static  int findCenterV2(int[][] edges) {
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            return edges[0][0];
        }
        return edges[0][1];
    }

    public static void main(String[] args) {
        int [][] numbers = new int[][]{{1,2}, {2,3},{4,2}};
        System.out.println(findCenter(numbers));
    }
}
