package DSA.Arrays.problems.Easy;
public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 8, 9, 11, 12, 12};
        System.out.println("the array is :"+ isSorted(arr));
        
    }
    static boolean isSorted(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) {
                return false;
                
            }
            
            
        } return true;
    }
}




// public class CheckSortedArray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 5, 8, 9, 11, 12, 12};
//         System.out.println("Array is sorted: " + isSorted(arr));
//     }

//     static boolean isSorted(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < arr[i - 1]) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
