
import java.util.Scanner;

public class Buffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        // the scanner considers enter as an input for nextLine
        //to avoid this, we can add an extra nextLine
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is: "+ name);
        scanner.close();
    }
    
}
