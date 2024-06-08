package programs.QAFOX;

import java.util.Scanner;

public class NumberOfLetterDigitSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number of character , numbers , spaces , symbol:");
        String str = scanner.nextLine();
        scanner.close();
        char[] ca = str.toCharArray();
        int digit = 0;
        int letter = 0;
        int space = 0;
        int others = 0;
        for (Character c : ca) {
            if(Character.isDigit(c)){
                digit++;

            }else if (Character.isLetter(c)) {
                letter++;

                
            }else if (Character.isSpaceChar(c)){
                space++;

            }else{
                others++;

            }

            
        }
        System.out.println("the number of digit:"+digit);
        System.out.println("the number of letter :"+letter);
        System.out.println("ther number of spaces:"+space);
        System.out.println("numbers of others:"+others);
    }

    
}