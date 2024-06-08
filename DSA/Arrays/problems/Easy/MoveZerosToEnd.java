package DSA.Arrays.problems.Easy;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.print("Original array: ");
        printArray(arr);

        moveZerosToEnd(arr);

        System.out.print("Array after moving zeros to the end: ");
        printArray(arr);
    }

    // Method to move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        if (arr.length == 0) {
            return; // If the array is empty, no need to process
        }

        int nonZeroIndex = 0; // Initialize a pointer for the position of the next non-zero element

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap elements at nonZeroIndex and i if they are not the same
                if (i != nonZeroIndex) {
                    int temp = arr[nonZeroIndex];
                    arr[nonZeroIndex] = arr[i];
                    arr[i] = temp;
                }
                nonZeroIndex++;
            }
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
