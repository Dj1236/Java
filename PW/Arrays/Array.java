package PW.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr [] = new int[5];
        float array [] = new float[5];
        int arr1 [] = {1,2,3,4,5,7,78};
        // in stack memory primitive data type , reference variable and function call are stored
        // while in heap memory object data type is defined 
        int arr2 [][] =new int[3][3]; // two d array intialize 
        int array2 [][] = {{1,2,3},{4,5,6}};
        int arr3 [][][] = new int[3][3][3];
        int array3 [][][] = {{{1,2,3},{4,5,6}},{{7,8,9},{9,8,7}},{{6,4,3},{3,2,1}}};
        // traversal of array :
        // for(int i =0;i<7;i++){
        //     System.out.print(arr1[i]+" ");
        // }
        // for (int nums:arr1){
        //     System.out.print(arr1[nums]);
        // }
        // for (int i = 0; i < array2.length; i++) {
        //     for (int j = 0; j < array2.length; j++) {
        //         System.out.print(array2[i][j]+" ");
        //     }
        // }
        // questions : sum of array , search in array , large and small element in array

        // how to take array input in java
        int InputArray[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the elements of array:");
        for (int i = 0; i < InputArray.length; i++) {
            InputArray[i] = scanner.nextInt();
        }
        for (int i : InputArray) {
            System.out.print(i+" ");
        }

        // trying to copy array to another array 
        int [] OrignalArray = InputArray;
        // here we just only passes the reference of the array not whole array so if we change any array will reflect in both
        // this is called as shadow copy
        // but if we dont need to reflect change in both the array than we use the concept of deep copy.
        int [] deepCopy = InputArray.clone();
        int [] arrayCopy = Arrays.copyOf(deepCopy, 0);
        
        // this deep copy have different address along with it 

        // last occurrence of x element :- 
        // if (arr[i] == 2) {
        //     position = i;
        // }
        // array is sorted or not ?
        /*
         * if (arr[i]>arr[i+1]) {
         * isSorted =false;
         * break;
         * }else{
         * isSorted =true;
         */
        // static method can only access the static variable  
        // static method only call static method
        //

        



    }
    
}
