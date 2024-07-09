package DSA.patterns;

public class Column {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int a = i;
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a=((a+5)-j)+1;
            }
            System.out.println("");
        }
        // System.out.println("");
    }
    
}
