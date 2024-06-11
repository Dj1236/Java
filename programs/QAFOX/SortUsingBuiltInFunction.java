package programs.QAFOX;

import java.util.Arrays;

public class SortUsingBuiltInFunction {
    public static void main(String[] args) {
        int arr[]= {1,3,5,7,9,2,4,6,8};
        System.out.println("before sorting "+Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println("after sorting "+ Arrays.toString(arr));
    }
    
}
