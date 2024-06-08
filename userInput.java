import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = scanner.nextLine();
        System.out.println("enter your age ");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        scanner.close();
    }
}
