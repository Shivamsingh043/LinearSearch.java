public class Maxin2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {-6, 77, 21},
                {11, 44},
                {4, 76, 81, 0},
                {54, -1, 43}
        };
        int result = max(arr);
        System.out.println(result);
    }
    static int max(int[][] arr){
        int ans = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for(int col = 1; col < arr[row].length; col++){
                if(arr[row][col]>ans){
                    ans = arr[row][col];
                }
            }
        }
        return ans;
    }
}
