package DSA.Arrays.problems.Easy;

public class SingleNumberFinder {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 2, 4, 4};
        System.out.println("The number that appears once is: " + findSingleNumber(array));  // Output: 3
    }
}
