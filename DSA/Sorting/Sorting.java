package DSA.Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1};
        System.out.println("before the sorting array" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("after the sorting array" + Arrays.toString(arr));
    }
}
