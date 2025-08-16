import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User input: String
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome to the Java Club "+name);
        
        //User Input: Number
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.println("So your age is: " + age );

        scanner.close();
    }
}
