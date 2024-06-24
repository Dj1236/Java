package DSA.patterns;

public class Pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){ // reverse:- int i =5 i>=1 i--
            for(int k =1;k<5-i;k++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
