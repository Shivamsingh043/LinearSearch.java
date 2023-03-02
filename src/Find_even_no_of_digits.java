public class Find_even_no_of_digits {
    public static void main(String[] args){
        int[] nums = {12, 345, 2, 6, 7896, 24};
        int ans = findnumbers(nums);
        System.out.println("number of even digits in the given array is "+ans);
    }
    static int findnumbers(int[] nums){
        int count = 0;
        for(int num = 0; num < nums.length; num++){
            int num2 = nums[num];
            boolean result = even(num2);
            if(result == true){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num2){
        int number_of_digits = digits(num2);
        if(number_of_digits %2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num2){
        int count = 0;
        while (num2>0){
            count++;
            num2 = num2/10;
        }
        return count;
    }

}
