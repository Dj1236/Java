package DSA.patterns;

public class ReverseOdd {
    public static void main(String[] args) {
        for(int i=4;i>=1;i--){
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
