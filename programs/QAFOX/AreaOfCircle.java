package programs.QAFOX;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius of circle:");
        double radius = scanner.nextDouble();
        System.out.println("the area of circle is :" +(Math.PI*radius*radius) );
        scanner.close();
    }
    
}
