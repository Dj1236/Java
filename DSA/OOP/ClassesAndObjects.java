package DSA.OOP;
// dynamic memory allocation is the allocation of the memory at the run time.
// new keyword allocated memory at the run time .
// constructor is a special function that defines what happens when the object is created.

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        // just declaring not intialize  
        // Student dhairya;
        
        // Student dhairya = new Student();

        
    }
    public class Student{
        int rollno[] = new int[5];
        String [] name = new String[5];
        Float marks[] = new Float[5];
    }
}
