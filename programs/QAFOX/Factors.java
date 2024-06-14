package programs.QAFOX;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = scanner.nextInt();
        scanner.close();
        for(int i =1;i<=num;i++){
            if(num%i==0){
                System.out.println("the factor of number is :"+i);
            }
        }
    }
    
}
