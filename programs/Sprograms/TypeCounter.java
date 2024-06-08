package programs.Sprograms;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class TypeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any type of string: ");
        String str = sc.nextLine();
        char [] ca = str.toCharArray();
        int digits =0;
        int letters =0;
        int space =0;
        int others =0;
        for(Character c :ca){
            if(Character.isDigit(c)){
                digits++;
            } else if(Character.isLetter(c)){
                letters++;
                
            } else if (Character.isSpaceChar(c)) {
                space++;
            } else {
                others++;

            }

        }
        System.out.println("Number of digits: "+digits);
        System.out.println("Number of letters: "+letters);
        System.out.println("Number of spaces: "+space);
        System.out.println("number of symbols"+others);
    }
    
}
