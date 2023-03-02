public class Findmin {
    public static void main(String[] args){
        int[] arr = {2, 76, -3, 76, 0, -33};
        int ans = search(arr);
        System.out.println("The minimum element in this array is "+ans);
    }
    static int search(int[] arr ){
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
