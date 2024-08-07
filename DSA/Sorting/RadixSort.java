import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int nums[] = { 170, 45, 75, 90, 802, 24, 2, 66 };

        System.out.println("before sorting:");
        System.out.println(Arrays.toString(nums));

        radixSort(nums);

        System.out.println("after sorting:");
        System.out.println(Arrays.toString(nums));
    }

    public static void radixSort(int[] arr) {
        // Find the maximum number to know the number of digits
        int max = getMax(arr);

        // Do counting sort for every digit. Note that instead
        // of passing the digit number, exponent is passed.
        // Exponent is 10^i where i is the current digit number
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // output array
        int[] count = new int[10]; // count array to store count of occurrences

        // Initialize count array with zeros
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Change count[i] so that count[i] contains the actual position of this digit
        // in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers
        // according to current digit
        System.arraycopy(output, 0, arr, 0, n);
    }
}
