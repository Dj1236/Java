package programs.QAFOX;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number of statement having multiple word");
        String str = scanner.nextLine();
        scanner.close();

        String[] strar = str.split("");
        System.out.println(strar);
        System.out.println("you statement count is :"+strar.length);

    }
    
}
