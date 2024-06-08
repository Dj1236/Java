package DSA.Arrays.problems.Easy;

public class LeftRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2; // Number of places to rotate
        System.out.print("Original array: ");
        printArray(arr);

        leftRotateByD(arr, d);

        System.out.print("Array after left rotation by " + d + " places: ");
        printArray(arr);
    }

    // Method to left rotate the array by d positions
    static void leftRotateByD(int[] arr, int d) {
        if (arr.length == 0 || d <= 0 || d >= arr.length) {
            return; // If the array is empty, d is non-positive, or d is greater than or equal to array length, no need to rotate
        }

        d = d % arr.length; // Handle cases where d >= arr.length

        reverseArray(arr, 0, d - 1); // Reverse the first part
        reverseArray(arr, d, arr.length - 1); // Reverse the second part
        reverseArray(arr, 0, arr.length - 1); // Reverse the entire array
    }

    // Helper method to reverse a part of the array
    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Helper method to print the array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
