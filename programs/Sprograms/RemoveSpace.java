package programs.Sprograms;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Dhairya Joshi!"; // String to be removed spaces from 
        System.out.println("Original String: " + str);
        str = str.replaceAll("\\s", ""); // Removing spaces from string
        System.out.println("String after removing spaces: " + str);
    }
    
}
