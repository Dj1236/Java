package programs.QAFOX;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number :");
        int num = sc.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(num + "x" + i + " = " + (num*i) );
        }
        sc.close();
    }
    
}
