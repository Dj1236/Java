package searching;

public class SearchInRange {
    public static void main(String[] args) {
        int nums[] = { 7, 4, 1, 8, 5, 2, 9, 6, 3 };
        int target = 1;
        int start = 2 ,end=5;
        int ans = linearSearch(nums, target, start, end);
        System.out.println(ans);
    }

    // we are searching the element if found return the index
    // other wise we will return -1
    public static int linearSearch(int arr[], int target, int start, int end) {
        if (arr.length == 0)
            return -1;

        // iterate through the array
        for (int i = start; i <end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;

    }
}
