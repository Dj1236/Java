package telusko;


    class Calculator{ 
        int a ;
        int b ;
        public int add(int n1,int n2){
            // System.out.println("in add");
            return n1+n2;
        }
        
    }

    public class demo {
        public static void main(String[] args) {
            int num1 = 4;
            int num2 = 5;
            // add(); to access this method we need objects
            Calculator clac = new Calculator();// every time you create an object jvm makes space in the memory 
            System.out.println(clac.add(num1, num2));
            // int result = clac.add(); also we can do this way 

            // int result = num1+num2;
            // System.out.println(result);

        }
        
    }
