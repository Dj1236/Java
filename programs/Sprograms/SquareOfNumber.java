package programs.Sprograms;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("the square of the number is : " + n*n);
        sc.close();
    }
    
}
/*
 * package programs.Sprograms;

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the square of the number is : " + n*n*n);
        sc.close();
    }
    
}

 */