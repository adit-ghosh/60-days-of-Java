import java.util.Scanner;
public class CalorieCounterPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calorie Counter Pro!");

        String food1,food2,food3; int cal1,cal2,cal3,totalCal;

        System.out.print("Enter the name of the first food item: ");
        food1 = scanner.nextLine();
        System.out.print("Enter the calories for "+food1+": ");
        cal1 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter the name of the second food item: ");
        food2 = scanner.nextLine();
        System.out.print("Enter the calories for "+food2+": ");
        cal2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the name of the third food item: ");
        food3 = scanner.nextLine();
        System.out.print("Enter the calories for "+food3+": ");
        cal3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nYour Calorie Intake: ");
        System.out.println("1. "+food1+" - "+cal1+" calories");
        System.out.println("2. "+food2+" - "+cal2+" calories");
        System.out.println("3. "+food3+" - "+cal3+" calories");

        totalCal = cal1+cal2+cal3;
        System.out.println("\nTotal Calorie Intake: "+totalCal+" calories");
        System.out.println("Thank You for using Calorie COunter Pro!");
        
        scanner.close();
    }
    
}
