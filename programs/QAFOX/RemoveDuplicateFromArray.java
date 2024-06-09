package programs.QAFOX;

import java.util.HashSet;
import java.util.Set;
// for unsorted array we use HashSet   


public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6};
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        Integer[] b = set.toArray(new Integer[set.size()]);
        
        // Print the array to verify the result
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
