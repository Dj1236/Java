package programs.Sprograms;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7 };
        // sum without missing 
        int sumWithoutMiss = 0 ;
        for(int i = 0 ; i<=7; i ++){
            sumWithoutMiss += i;
        }
        System.out.println("Sum without missing number is : " + sumWithoutMiss);

        int sumWithMiss = 0;
        for(int i = 0 ; i<arr.length; i ++){
            sumWithMiss += arr[i];

        }
        System.out.println(sumWithoutMiss-sumWithMiss);
    }
    
}
