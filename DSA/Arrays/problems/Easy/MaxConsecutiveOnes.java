package DSA.Arrays.problems.Easy;
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        // Final check for the last sequence of 1s
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
    public static void main(String[] args) {
        int[] binaryArray = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(binaryArray));  // Output: 3
    }
}

