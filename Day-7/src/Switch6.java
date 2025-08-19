import java.util.Scanner;

public class Switch6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a or b: ");
        String choice = scanner.nextLine();

        switch(choice){
            case "a":
                System.out.println("Now choose 1 or 2: ");
                String choice2 = scanner.nextLine();
                switch (choice2){
                    case "1":
                        System.out.println("Thanks for choosing 1");
                        break;
                    case "2":
                        System.out.println("Thanks for choosing 2, bad choice");
                        break;
                    default:
                        System.out.println("You Chose Wrongly");
                        break;
                }
                break;
            case "b":
                System.out.println("B is inferior");
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
    }
}
