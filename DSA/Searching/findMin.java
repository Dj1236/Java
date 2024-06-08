package DSA.Searching;

public class findMin {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, -2 ,9,-1};
        System.out.println(min(arr));

    }
    static int min(int[]arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                }
                }
                return min;
    }
    
}
