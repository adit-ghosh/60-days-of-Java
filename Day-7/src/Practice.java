import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Ultimate Adventure Game!");
        System.out.println("Your goal is to find the hidden treasure. Choose wisely!");
        System.out.println("You are at a crossroad. Do you want to go left or right?");

        System.out.print("Type 'left' or 'right': ");
        String direction = input.nextLine();
        direction = direction.toLowerCase();

        switch (direction){
            case "left":
                System.out.println("You walk down a dark path and find a mysterious cave.");
                System.out.println("Do you want to enter the cave or walk past it?");

                System.out.print("Type 'enter' or 'walk': ");
                String choice = input.nextLine();
                choice = choice.toLowerCase();

                switch(choice){
                    case "enter":
                        System.out.println("Inside the cave, you find a sleeping dragon!");
                        System.out.println("Do you want to fight the dragon or sneak past it?");

                        System.out.print("Type 'fight' or 'sneak': ");
                        String action = input.nextLine();
                        action = action.toLowerCase();

                        switch (action){
                            case "sneak":
                                System.out.println("You sneak past the dragon and find the treasure behind it. You win!");
                                break;
                            case "fight":
                                System.out.println("You fought the dragon and the dragon killed you! Game Over!");
                                break;
                            default:
                                System.out.println("Invalid Choice! The Dragon saw and killed you! Game Over!");
                                break;
                        }
                        break;
                    case "walk":
                        System.out.println("You walked away from the cave and found the city! Game Over!");
                        break;

                    default:
                        System.out.println("Invalid Choice! You crash into the cave! Game Over!");
                        break;
                }
                break;
            case "right":
                System.out.println("You walked and found the city! Game Over!");
                break;
            default:
                System.out.println("Invalid choice. You got lost in the wilderness. Game over.");
                break;
        }

    }
}
