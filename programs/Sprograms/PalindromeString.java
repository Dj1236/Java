package programs.Sprograms;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "public toilet ?";
        char[] ca = str.toCharArray();
        int size = ca.length;
        String reverseString = "";
        for (int i = size - 1; i >= 0; i--) {
            reverseString = reverseString + ca[i];

            }
            System.out.println(reverseString);
            
            if ( str.equals(reverseString)){
                System.out.println("String is palindrome");
            }else{
                System.out.println("String is not palindrome");
            }



    }
    
}
