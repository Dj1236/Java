package DSA.Arrays;

public class Array {
    public static void main(String[] args) {
        // store the roll number 
        int roll_no = 12;
        // store another 2 roll number 
        int roll_no1 =36;
        // normal data types are stored in the heap memory in the java and primitive datatype is stored in the stack memory in java 
        // this not make sense we use arrays collection of same data types 
        // int [] rollno; this is the declaration of the array  it is done at the compile time 
        // rollno = new int[5]; this is actual memory creation of the array in the heap memory this is created at runtime(dyanamic memory allocation)
        // array objects in java may not continuos cause it store in the heap memory and that is not continuous 
        // let see the syntax of the array 
        // datatype[] variable_name = new datatype[size];
        // store 5 roll number 
        // here in array all the reference objects points to the null 
        int rollno[] = new int[5];// datatype represent what type of data is stored in the array 

        // or you can directly write like this 
        int[] rollno1 = {1,2,3,4,5};
    }
    
}
