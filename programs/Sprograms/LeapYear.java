package programs.Sprograms;

import java.util.Scanner;

public class LeapYear { // leap year has 366 days  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean IsleapYear =false;
        if (year % 4 == 0) {
            if(year % 100 ==0){
                if(year % 400 == 0){
                    IsleapYear = true;
                }
            }
        
    } else {
        IsleapYear = false;
    }
    sc.close();
}
}
