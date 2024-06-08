package DSA.Arrays.problems.Easy;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 5};
        int missing = findMissingNumber(arr);
        System.out.println("The missing number is: " + missing);
    }

    // Method to find the missing number in the array using XOR
    static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int xorAll = 0;
        int xorArr = 0;

        // XOR all indices from 0 to n
        for (int i = 0; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR all elements in the array
        for (int num : arr) {
            xorArr ^= num;
        }

        // XOR of xorAll and xorArr gives the missing number
        return xorAll ^ xorArr;
    }
}


// public class MissingNumber {
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 3, 4, 5};
//         int missing = findMissingNumber(arr);
//         System.out.println("The missing number is: " + missing);
//     }

//     // Method to find the missing number in the array
//     static int findMissingNumber(int[] arr) {
//         int n = arr.length;
//         int expectedSum = (n * (n + 1)) / 2; // Sum of first n natural numbers
//         int actualSum = 0;

//         for (int num : arr) {
//             actualSum += num;
//         }

//         return expectedSum - actualSum;
//     }
// }
