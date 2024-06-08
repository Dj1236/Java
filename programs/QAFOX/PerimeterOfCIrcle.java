package programs.QAFOX;

import java.util.Scanner;

public class PerimeterOfCIrcle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius of circle:");
        int radius = scanner.nextInt();
        System.out.println("the perimeter of the circle is :"+(2*Math.PI*radius));
        scanner.close();

    }
    
}
