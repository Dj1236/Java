package programs;
public class Factorial {

    static int factorial (int i ){
        if(i==0){
            return 1;
        }else{
            return i * factorial(i-1);
        }
    }
    public static void main(String[] args) {
        int  fact = 1;
        int number =5;
        fact = factorial(number);
        System.out.println("factorial of this number is " + fact);
    
    }
}


       // public static void main(String[] args) {
    //     int i , fact = 1;
    //     int number = 5;
    //     for(i =1;i<= number;i++){
    //         fact = fact * i ;
    //     }
    //     System.out.println("Factorial of" +" "+ number +" "+ "is" + " " + fact);
    // }

