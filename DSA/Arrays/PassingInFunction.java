package DSA.Arrays;

import java.util.Arrays;
// strings are immutable in java while arrays are mutable in java 

public class PassingInFunction {
    public static void main(String[] args) {
        int [] nums = {12,36,7,31};
        System.out.println(Arrays.toString(nums));
        change(nums);
    }
    static void change (int arr[]){
        arr[0] = 99 ;
    }
}
