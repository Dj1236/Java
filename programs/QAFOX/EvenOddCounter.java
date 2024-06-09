package programs.QAFOX;

import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = scanner.nextInt();
        scanner.close();
        int oddCount =0;
        int evenCount =0;

        while (num != 0) {
            int remainder = num %10;
            if (remainder % 2 ==0) {
                evenCount++;
                
            }else{
                oddCount++;
            }
            num = num/10;
        }
        System.out.println("the number of even digit is :"+evenCount+"the number of odd digit is:"+oddCount);

    }
    
}
