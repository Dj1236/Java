package DSA.patterns;

public class Swasthik {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                if ((i == 3) || (j == 3) || (i == 0 && j > 3) || (j == 0 && i < 3) || (i == 6 && j < 3) || (j == 6 && i > 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
