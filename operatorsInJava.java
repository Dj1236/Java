public class operatorsInJava {
    public static void main(String[] args) {
        //Arithmetic operators 
        int a = 5;
        int b = 10;
        System.out.println("Addition : " + (a+b));  // addition 
        System.out.println("Subtraction : " + (a-b));   // subtraction 
        System.out.println("Multiplication : " + (a*b)); // multiplication
        System.out.println("Division : " + (a/b));       // division
        System.out.println("Modulus : " + (a%b));         // modulus
        // Increment and Decrement Operators
        System.out.println("\nIncrement and Decrement Operators");
        System.out.println("Before increment: Value of a is "+a);
        a++;
        System.out.println("After increment: Value of a is "+a);
        System.out.println("Before decrement: Value of a is "+a);
        a--;
        System.out.println("After decrement: Value of a is "+a);
        // Assignment operator
        System.out.println("\nAssignment operator");
        int c=7, d;
        System.out.println("Value of c is "+c);
        d=c;// d+=c , -= , *= ,/= ,%= ,&=,
        System.out.println("Value of d is now "+d);
        System.out.println("Value of c is now "+c);
        // comparison operator
        
        System.out.println(a==b); // not equal (!=) , <,> <=, >=
        // logical operator
        boolean x = true;
        boolean y = false;
        boolean result = (x && y); // result = false // same as  ||(OR) , !(NOT) 
        System.out.println(result);
        // bitwise operator
        int a1 = 5; // Binary: 0101
        int b2 = 3; // Binary: 0011
        int result1 = (a1 & b2); // result = 1 (Binary: 0001)
        System.out.println(result1);
        // ternary operator 
        int max = (a > b)? a : b ;
        System.out.println("Maximum value is "+ max);
        // shift operator
        // unary operator 
    
    
    }
}
