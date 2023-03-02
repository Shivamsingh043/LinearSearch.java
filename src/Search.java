public class Search {
    public static void main(String[] args) {
        int[] arr = {23, 34, 1, 91, -2, 47, -3};
        int target = 91;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
        int ans2 = linearSearch2(arr, target);
        System.out.println(ans2);
    }
    static int linearSearch(int[] arr, int target){
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    static int linearSearch2(int[] arr, int target){
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}
