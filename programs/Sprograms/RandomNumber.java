package programs.Sprograms;

public class RandomNumber {
    public static void main(String[] args) {
        double random = Math.random();
        int range = 100;
        int randomInt = (int) (random * range);
        System.out.println("Random number: " + randomInt);

    }
    
}
