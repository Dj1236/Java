package searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 9, 1, 5, 6, 4, 2, 3, 10, 24, 15 };
        int target = 9;

        // Sort the array first
        Arrays.sort(arr);

        int ans = binarySearch(arr, target);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Index of target " + target + ": " + ans);
    }

    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // Correct calculation of mid
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
/*
 * package searching;
 * 
 * import java.util.Arrays;
 * 
 * public class OrderAgnosticBinarySearch {
 * public static void main(String[] args) {
 * int arrAsc[] = {2, 4, 6, 8, 10, 12, 14};
 * int arrDesc[] = {14, 12, 10, 8, 6, 4, 2};
 * int target = 10;
 * 
 * System.out.println("Index of target " + target + " in ascending array: " +
 * orderAgnosticBinarySearch(arrAsc, target));
 * System.out.println("Index of target " + target + " in descending array: " +
 * orderAgnosticBinarySearch(arrDesc, target));
 * }
 * 
 * public static int orderAgnosticBinarySearch(int arr[], int target) {
 * int start = 0;
 * int end = arr.length - 1;
 * 
 * // Determine if the array is sorted in ascending or descending order
 * boolean isAscending = arr[start] < arr[end];
 * 
 * while (start <= end) {
 * int mid = start + (end - start) / 2;
 * 
 * if (arr[mid] == target) {
 * return mid;
 * }
 * 
 * if (isAscending) {
 * if (target < arr[mid]) {
 * end = mid - 1;
 * } else {
 * start = mid + 1;
 * }
 * } else {
 * if (target > arr[mid]) {
 * end = mid - 1;
 * } else {
 * start = mid + 1;
 * }
 * }
 * }
 * 
 * return -1; // Target not found
 * }
 * }
 * 
 */