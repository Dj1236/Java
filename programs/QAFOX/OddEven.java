package programs.QAFOX;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number :");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("even number ");

        }
        else{
            System.out.println("odd number ");
        }
        sc.close();
    }
    
}
