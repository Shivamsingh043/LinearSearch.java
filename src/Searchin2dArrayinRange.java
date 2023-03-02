import java.util.Arrays;

public class Searchin2dArrayinRange {
    public static void main(String[] args){
        int[][] arr = {
                {-6, 77, 21},
                {11, 44},
                {4, 76, 81, 0},
                {54, -1, 43}
        };
        int target = 44;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        int ans2 = search2(arr, target);
        System.out.println(ans2);
    }
    static int[] search(int arr[][], int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                int element = arr[row][col];
                if(element == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int search2(int arr[][], int target){
        if(arr.length==0){
            return -1;
        }
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                int element = arr[row][col];
                if(element == target){
                    return element;
                }
            }
        }
        return -1;
    }
}
