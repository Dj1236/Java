package programs.QAFOX;

public class leftRotateString { 
    public static void main(String[] args) {
        String str = "dhairya";
        char[] ca = str.toCharArray();
        char first = ca[0];
        int size = ca.length;
        for (int i = 0; i < ca.length-1; i++) {
            ca[i]=ca[i+1];

        }
        ca[size-1]=first;
        StringBuffer sb = new StringBuffer();
        for (char c : ca) {
            sb.append(c);
        }

    }
    
}
