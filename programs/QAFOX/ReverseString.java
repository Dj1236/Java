package programs.QAFOX;

public class ReverseString {
    public static void main(String[] args) {
        String str = "MOM";
        char[] ch =str.toCharArray();
        int size = ch.length;
        String reverseString = "";
        for(int i= size-1; i>= 0;i--){
            reverseString += ch[i]; 


        }
        System.out.println(" the reverse string is :"+reverseString);
        if(str.equals(reverseString)){
            System.out.println("this is palindrome number");
        }
    }
    
}
