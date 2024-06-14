package programs.QAFOX;

import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence :");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(str.toLowerCase());

    }
    
}
