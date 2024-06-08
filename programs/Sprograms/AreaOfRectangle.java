package programs.Sprograms;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length :");
        double length = sc.nextDouble();
        System.out.println("enter the breadth :");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("area of rectangle is :"+area);
        sc.close();
    }
    
}
