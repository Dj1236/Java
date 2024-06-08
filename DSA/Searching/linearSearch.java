package DSA.Searching;

public class linearSearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 ,12 , 4 ,11};
        int target = 4;
        System.out.println(linearSearching(arr, target));
        
    }
    static int linearSearching(int[]arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
                }


            
        }
        return -1;

    }
    
}
