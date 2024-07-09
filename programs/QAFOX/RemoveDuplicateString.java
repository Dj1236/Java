package programs.QAFOX;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str = "dhairyaJoshi";

        // LinkedHashSet to maintain order and remove duplicates
        Set<Character> set = new LinkedHashSet<>();

        // Adding characters to the set
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        // Constructing the result string without duplicates
        StringBuilder sb = new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }

        // Printing the string without duplicates
        String result = sb.toString();
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + result);
    }
}
