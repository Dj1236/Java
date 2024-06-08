package DSA.Arrays.problems.Easy;
public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = { 2,4,6,8,10,12,1,3,5,7,9,11};
        System.out.println(secondLargestNumber(arr));
    }
    static int secondLargestNumber(int[]arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]>secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
                
            }
            
        }
        return secondLargest;
    }
}




