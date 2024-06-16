package programs.QAFOX;

import java.util.Arrays;
import java.util.Scanner;


public class UserInputArray {
    public static void main(String[] args) {
        // first taking size of the array 
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int size = scanner.nextInt();
        // create an array 
        int arr[] = new int[size];
        for(int i =0;i<size;i++){
            System.out.println("enter the number:");
            arr[i] =scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(arr));

    }
    
}
