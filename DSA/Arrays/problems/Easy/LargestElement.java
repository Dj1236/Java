package DSA.Arrays.problems.Easy;
public class LargestElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,10,8,9};
        System.out.println(LargestNumber(arr));
    }
    static int LargestNumber(int[]arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        return max;
    }
}


