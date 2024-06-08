package DSA.Arrays.problems.Medium;

public class ZeroOneTwo {
    public static void sortColors(int[] nums) {
        
        int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // Swap nums[low] and nums[mid], increment both low and mid
                    int temp0 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    // Just move the mid pointer
                    mid++;
                    break;
                case 2:
                    // Swap nums[mid] and nums[high], decrement high
                    int temp2 = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
