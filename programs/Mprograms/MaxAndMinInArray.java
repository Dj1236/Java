package programs.Mprograms;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6 ,8 , -1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                    }
                    }
                    System.out.println("Max value is " + max);
                    System.out.println("Min value is " + min);
        }

    }
    

