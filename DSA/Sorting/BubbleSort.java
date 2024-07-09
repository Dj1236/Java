public class BubbleSort {
    // time complexity = O(n^2)
    public static void main(String[] args) {
        int nums[] = { 8, 7, 9, 6, 4, 5, 1, 3, 2 };
        int size = nums.length;
        boolean swapped;

        System.out.println("before sorting:");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.println();
        System.out.println("after sorting:");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
