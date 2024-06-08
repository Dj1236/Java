package DSA.Arrays.problems.Easy;

import java.util.HashMap;

public class LongestSubarraywithSumk {
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        // HashMap to store (cumulative sum, index)
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int maxLength = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the cumulative sum
            cumulativeSum += nums[i];

            // Check if the cumulative sum equals k
            if (cumulativeSum == k) {
                maxLength = i + 1;
            }

            // Check if the (cumulativeSum - k) is present in the map
            if (sumIndexMap.containsKey(cumulativeSum - k)) {
                int previousIndex = sumIndexMap.get(cumulativeSum - k);
                maxLength = Math.max(maxLength, i - previousIndex);
            }

            // Add the cumulative sum to the map if it is not already present
            if (!sumIndexMap.containsKey(cumulativeSum)) {
                sumIndexMap.put(cumulativeSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Length of the longest subarray with sum " + k + " is: " + longestSubarrayWithSumK(array, k));  // Output: 4
    }
}
// for negative and positive both 
/*import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        // HashMap to store (cumulative sum, index)
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int maxLength = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the cumulative sum
            cumulativeSum += nums[i];

            // Check if the cumulative sum equals k
            if (cumulativeSum == k) {
                maxLength = i + 1;
            }

            // Check if the (cumulativeSum - k) is present in the map
            if (sumIndexMap.containsKey(cumulativeSum - k)) {
                int previousIndex = sumIndexMap.get(cumulativeSum - k);
                maxLength = Math.max(maxLength, i - previousIndex);
            }

            // Add the cumulative sum to the map if it is not already present
            if (!sumIndexMap.containsKey(cumulativeSum)) {
                sumIndexMap.put(cumulativeSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] array = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println("Length of the longest subarray with sum " + k + " is: " + longestSubarrayWithSumK(array, k));  // Output: 4
    }
}
 */