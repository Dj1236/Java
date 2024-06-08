package programs.Sprograms;

public class OccurrenceInString {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        int beforeLength = str.length();
        String str1 = str.replace("a","");
        int afterLength = str1.length();
        int count = beforeLength - afterLength;
        System.out.println("The number of occurrences of a in the given string is: " + count);


    }
    
}
