package DSA.OOP;

import java.util.Scanner;

// classes ane object na hoi toi aapde badhi value store kari sakiye array thi but e vadhare complex thai jai aama ek maaj badhu aavi jai
public class StudentClass {
    // creating a new data type 
    // classes aapde tyare vapriya jyare ek object na multiple attributes hoi tyare vaparie
    // aapde ichiye tohh aapde aa class main function ni andar pan lakhi sakiye pan pachi e bar thi access na thai sake etle bar lakhiye 
    // to pass class through the function we have to decalare the class outside the main method 
    // classe are pass by refrence
    // jyare ghana badha classes define karva hoi tyare apde biji navi file banavi ne kariye aane pachi import karvi laiye 
    // its just a blueprint 
    public static class Student {
        // aabadha ni default value null hoi che karnke khali declare kariyu che intialize nathi kariyu
        String name;
        int rno;
        double percentage;

    }
    public static class Car { // class no pelo word capital hovo jaruri nathi pan convention che saru lage
        String name;
        String type;
        int price ;

    
        
    }
    public static void main(String[] args) {
        // object intialize thai gayo che
        //dhairya is a object of the student class
        // objects are the real life entities
        Car fanti = new Car();
        fanti.name="maruti 800";
        fanti.type= "lion";
        fanti.price=1000000000;
        Scanner scanner = new Scanner(System.in);//a same syntax che scanner no class no
        Student dhairya = new Student();
        scanner.close();
        dhairya.name="dhairya joshi";
        dhairya.percentage=99.99;
        dhairya.rno=1236;
        // System.out.println(name); aavi rite access na thai 
        System.out.println(dhairya.percentage);// avi rite access thai 
   }
    
}
