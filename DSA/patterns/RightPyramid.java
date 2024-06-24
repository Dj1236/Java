package DSA.patterns;

public class RightPyramid {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int j =1;j<=i;j++){
                // System.out.print("*");
                // System.out.print(i);
                // System.out.print(j);
                // System.out.print((char)(96+j));
                System.out.print((char) (96 + i));

            }
            System.out.println();
        }
    }
    
}
