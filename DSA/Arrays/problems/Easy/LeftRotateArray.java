package DSA.Arrays.problems.Easy;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Original array: ");
        printArray(arr);

        leftRotateByOne(arr);

        System.out.print("Array after left rotation by one: ");
        printArray(arr);
    }

    // Method to left rotate the array by one position
    static void leftRotateByOne(int[] arr) {
        if (arr.length == 0) {
            return; // If the array is empty, no need to rotate
        }

        int firstElement = arr[0]; // Store the first element

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i]; // Shift each element to the left by one position
        }

        arr[arr.length - 1] = firstElement; // Move the first element to the end of the array
    }

    // Helper method to print the array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
