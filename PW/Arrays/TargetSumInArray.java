package PW.Arrays;

import java.util.Scanner;

public class TargetSumInArray {

    static void SearchDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(i);
                }
            }
        }
    }

    static void RotateInPlace(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void SwapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            SwapInArray(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr) {
        /*
         * Alternative swap without temp:
         * arr[i] = arr[i] + arr[j];
         * arr[j] = arr[i] - arr[j];
         * arr[i] = arr[i] - arr[j];
         */
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int secondMax(int arr[]) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return findMax(arr);
    }

    static void UniqueInArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans + " This is a unique element in array");
    }

    static int TripletSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int PairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Test your methods here, e.g.,
        // System.out.println(PairSum(arr, target));
        // UniqueInArray(arr);
    }
}
