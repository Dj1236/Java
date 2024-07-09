package DSA.patterns;

public class Counting {
    public static void main(String[] args) {
        int c=1;//10
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;//c--
            }
            System.out.println("");
        }
    }
    
}
