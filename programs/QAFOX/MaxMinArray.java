package programs.QAFOX;

public class MaxMinArray {
    public static void main(String[] args) {
        int arr[]= {1,3,5,7,9,2,4,6,8,10,-1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max =arr[i];

            }
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println("the max no in the array is : "+max+" and min no in array is : "+min);
    }
    
}
