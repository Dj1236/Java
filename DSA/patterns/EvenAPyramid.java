package DSA.patterns;

public class EvenAPyramid {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for(int k=1;k<=4-i;k++){
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){
                if (j%2==0) {
                    System.out.print("A");
                }
                else{
                    System.out.print("*");
                }
            } System.out.println("");
        }
    }
}
