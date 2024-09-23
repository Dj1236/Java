package PW.Arrays;

import java.util.Scanner;

public class TwoPointer {

    static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    static void reverseArray(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    static void swapArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // square of non decreasing array also gives non decreasing array but also in case of negative number also present in array
    static int [] sortSquares(int arr[]){
        int n = arr.length;
        int left=0,right=n-1;
        int [] ans = new int[n];
        int k =n-1;

        while (left<=right) {
            if (Math.abs(arr[left])>Math.abs(arr[right])) {
                ans[k--]= arr[left] * arr[left];
                left++;
            }
            else{
                ans[k--] =arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    static void sortEvenOdd(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swapArray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    static void sortZeroAndOnes(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapArray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        // Testing sortEvenOdd method
        // System.out.println("Sorted array (Even-Odd):");
        // sortEvenOdd(arr);
        // printArray(arr);

        // Testing sortZeroAndOnes method
        // System.out.println("Sorted array (0s and 1s):");
        // sortZeroAndOnes(arr);
        // printArray(arr);

        int [] ans = sortSquares(arr);
        // reverseArray(ans);
    }
}
