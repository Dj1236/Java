package programs.QAFOX;

public class InsertWordInMiddleOfText {
    public static void main(String[] args) {
        String str = " One Three";
        str.substring(0,4);
        // other program for last three letters of given string text 
        char ch[]=str.toCharArray();
        int size = ch.length;
        String lastThreeLetters ="";
        for (int i =size-1 ; i >=size-3; i--) {
            lastThreeLetters = ch[i]+lastThreeLetters;
            
        }
    }
    
}
