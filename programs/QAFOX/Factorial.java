package programs.QAFOX;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        sc.close();
        // logic for the factorial
        int fact =factorial(num);
        System.out.println("the factorial of "+num+"is "+fact);
        
        

    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
}
