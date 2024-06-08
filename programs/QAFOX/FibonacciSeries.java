package programs.QAFOX;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number for fibonnaci series:-");
        int number = scanner.nextInt();
        scanner.close();
        int a =1 ,b =1;
        int f =0;
        System.out.println(a +"");
        System.out.println(b +"");

        while (f<=number) {
            f = a+b;
            if(f>number)
            break;
            System.out.println(f +"");
            a = b;
            b = f;
            

            
        }



    }
    
}
