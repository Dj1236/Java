package DSA.Arrays.problems.Easy;
// public class RemoveDuplicatesFromSortedArray {
//     public static void main(String[] args) {
//         int arr[] ={1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
//         int newLength = removeDuplicates(arr);
//         System.out.println("after removing the elements");
//         for (int i = 0; i < newLength; i++) {
//             System.out.println(arr[i] + " ");
            
//         }
        
//     }
//     static int removeDuplicates(int arr[]){
//         if (arr.length == 0) {
//             return 0;
            
//         }
//         int uniqueIndex = 1;
//         for (int i = 1; i < arr.length; i++) {
//             if(arr[i] != arr[i-1]){
//                 arr[uniqueIndex] = arr[i];
//                 uniqueIndex++;
//             }
            
//         }
//         return uniqueIndex;

//     }
// }
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        int newLength = removeDuplicates(arr);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            
            return 0;
        }

        int uniqueIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}

