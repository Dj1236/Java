package DSA.patterns;

public class ReverseV {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<=8;j++){
                if (i-j==4 || i+j==4) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
