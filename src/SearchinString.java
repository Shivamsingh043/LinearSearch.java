public class SearchinString {
    public static void main(String[] args){
        String name = "Shivam singh";
        char target = 'v';

        System.out.println(search(name,target));
    }
    static int search(String str, char target){
        if(str.length() == 0){
            return -1;
        }
        for(int i =0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
