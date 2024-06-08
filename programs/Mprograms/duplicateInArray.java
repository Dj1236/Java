package programs.Mprograms;
// // here we have to remove the duplicates from the array  with the hashset.
// now we are going to done with the index
public class duplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,6,7,8,8,9,10,10};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i+1]) {
                arr[j] = arr[i];
                j++;
        }
    }
    arr[j] = arr[arr.length-1];
}
}






// here with the hashset 
// import java.util.HashSet;
// import java.util.Set;

// public class duplicateInArray {
//     public static void main(String[] args) {
//         int [] arr = {1,2,2,3,4,4,5,6,6,7,8,8,9};
//         Set<Integer> set = new HashSet<Integer>();
//         for (int i = 0; i < arr.length; i++) {
//             set.add(arr[i]);
//         }
//         // System.out.println(set);
//     }
// }
