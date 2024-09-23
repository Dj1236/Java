package searching;

import java.util.Arrays;

public class StringBinarySearch {
    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "cherry", "date", "fig", "grape", "kiwi" };
        String target = "date";

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Found " + target + " at index " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    public static int binarySearch(String[] arr, String target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int comparison = target.compareTo(arr[mid]);

            if (comparison < 0) {
                end = mid - 1;
            } else if (comparison > 0) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1; // Target not found
    }
}
