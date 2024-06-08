package programs.QAFOX;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year :");
        int year = sc.nextInt();

        boolean isLeapYear = false;

        if (year % 4 ==0){
            if(year % 100 == 0){
                if(year % 400 ==0){
                    isLeapYear = true;
                }
                else{
                    isLeapYear = false;
                }
            }
            else{
                isLeapYear = true;
            }
        }
        else{
            isLeapYear =false;
        }
        if (isLeapYear) {
            System.out.println("given year " + year + "is leap year");
            
        } else{
            System.out.println("not leap year");
        }
        sc.close();
        
    }
    
    
}
