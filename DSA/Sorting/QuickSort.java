public class QuickSort {
    public static void main(String[] args) {
        int nums[] = { 8, 7, 9, 6, 4, 5, 1, 3, 2 };

        System.out.println("before sorting:");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        quickSort(nums, 0, nums.length - 1);

        System.out.println();
        System.out.println("after sorting:");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
