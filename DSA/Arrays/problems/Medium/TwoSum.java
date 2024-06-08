// we can do this two sum (black moon emoji) with brute force method like two for loops and iterate thourgh for loop if both are same than return target
// also we can do with the hash map where we store the array value into the hasmap and check for the complement exits or not if exist then return target
// also we can do this with two pointer method first we have to store the array than we have to point one pointer first and other at the last and check
// the result of the target if exist then return the target if not exists then then iterate the pointer

package DSA.Arrays.problems.Medium;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // If it is, return the indices
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add the current value and its index to the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
/*import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Array to store the original indices before sorting
        int[] originalIndices = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            originalIndices[i] = i;
        }

        // Sort the array and keep track of the original indices
        Arrays.sort(nums);
        
        // Initialize two pointers
        int left = 0;
        int right = nums.length - 1;
        
        // Loop until the two pointers meet
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                // Find the original indices of the two numbers
                return new int[] { originalIndices[left], originalIndices[right] };
            } else if (sum < target) {
                // Move the left pointer to the right
                left++;
            } else {
                // Move the right pointer to the left
                right--;
            }
        }
        
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
 */