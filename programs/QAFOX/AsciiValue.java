package programs.QAFOX;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character you want ascii value of:");
        char c = scanner.nextLine().charAt(0);
        scanner.close();
        int ascii = (int)c;
        System.out.println("the ascii value of this number is :"+ascii);
    }
    
}
