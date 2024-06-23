package programs.QAFOX;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str = "madarchod";
        Set<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
            
        }

    }
    
}
