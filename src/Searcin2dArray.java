import java.util.Arrays;

public class Searcin2dArray {
    public static void main(String[] args){
        int[][] arr = {
                {-6, 77, 21},
                {11, 44},
                {4, 76, 81, 0},
                {54, -1, 43}
        };
        int target = -1;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                int element = arr[row][col];
                if(element == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
