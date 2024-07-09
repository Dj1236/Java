public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 8, 7, 9, 6, 4, 5, 1, 3, 2 };
        int size = nums.length;

        System.out.println("before sorting:");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted portion
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.println();
        System.out.println("after sorting:");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
