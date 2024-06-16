package programs.QAFOX;

import java.util.Scanner;

public class FirstHalfOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the String");
        String str = scanner.nextLine();
        scanner.close(); 
        // logic for printing first half of given string 
        int size = str.length();
        System.out.println("the first half of the string is :"+str.substring(0, size/2));
    }
    
}
