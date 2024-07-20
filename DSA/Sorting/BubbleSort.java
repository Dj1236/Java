// sorting is a process of arranging the data in the sequintial order 
// bubble sort is the one of the sorting algo where the two value are compare and swaps according to aes , desc order 
// total number of the rounds in the bubble sort depends upon the number of elements - 1 .
// time complexity is O(n^2)

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]= {8,5,2,7,4,1,9,6,3};
        int temp;
        System.out.println("before sorting :");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        for (int i = 0; i < arr.length; i++) {
            int flag =0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {  // use compare to method for if we have string 
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    flag =1;
                }
            }
            if (flag ==0) {
                break;
            }
        }
        System.out.println();
        System.out.println("after sorting :");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

// public class BubbleSort {
//     // time complexity = O(n^2)
//     public static void main(String[] args) {
//         int nums[] = { 8, 7, 9, 6, 4, 5, 1, 3, 2 };
//         int size = nums.length;
//         boolean swapped;

//         System.out.println("before sorting:");
//         for (int i : nums) {
//             System.out.print(i + " ");
//         }

//         for (int i = 0; i < size - 1; i++) {
//             swapped = false;
//             for (int j = 0; j < size - i - 1; j++) {
//                 if (nums[j] > nums[j + 1]) {
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                     swapped = true;
//                 }
//             }
//             if (!swapped) {
//                 break;
//             }
//         }

//         System.out.println();
//         System.out.println("after sorting:");
//         for (int i : nums) {
//             System.out.print(i + " ");
//         }
//     }
// }
