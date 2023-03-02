public class SearchinRange {
    public static void main(String[] args){
        int[] arr = {2, 3, 65, 76, 89, -3, 45};
        int target = -3;
        int ans = search(arr, target, 2, 6);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int index = start; index <= end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
