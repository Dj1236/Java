package programs.Sprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        for(char c:ch){
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);

            }
            else{
                m.put(c,1);

            }
        }
        for(Character c : m.keySet()){
            if(m.get(c)>1){
                System.out.println(c+" "+m.get(c));
                }
        }
        
    }
}
