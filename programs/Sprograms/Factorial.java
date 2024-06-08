package programs.Sprograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        System.out.println(Factorial(num));
        sc.close();

    }
    static int Factorial(int n){
        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }
    
}
