package programs.QAFOX;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "12";
        int num = Integer.parseInt(str);
        System.out.println(num/12);
    }
    
}
/*now same as integer to string
 * int num = 12;
 * String str = Integer.toString(num);
 * Sytem.out.println(str.length());
 */