public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = { 8, 7, 9, 6, 4, 5, 1, 3, 2 };
        int size = nums.length;

        System.out.println("before sorting:");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        for (int i = 1; i < size; i++) {
            int key = nums[i];
            int j = i - 1;

            // Move elements of nums[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }

        System.out.println();
        System.out.println("after sorting:");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
