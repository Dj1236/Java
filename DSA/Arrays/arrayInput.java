package DSA.Arrays;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] age = new int[5];
        age[0] = 10;
        age[1] = 20;
        age[2] = 30;
        age[3] = 40;
        age[4] = 50;
        // 
        System.out.println(age[1]);
        // input using for loop 
        for( int i = 0; i<age.length;i++){
            age[i] = in.nextInt();
            
        }
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]+ "");
        }
        for (int i : age) { // for every element in the array print the element 
            System.out.println(i+""); // here i represent elements of the array 
            
        }
    }
    
}
