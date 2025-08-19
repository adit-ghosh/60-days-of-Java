import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        //Switch with Char
        char grade = 'A';
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good Job");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'E':
                System.out.println("Better Luck Next Time");
                break;
            case 'F':
                System.out.println("You Failed, Try Better Next Time");
                break;
            default:
                System.out.println("Grade doesn't exist");
                break;
        }
        //Switch with Strings
        Scanner seasoning = new Scanner(System.in);
        System.out.print("What Season is it? ");
        String season = seasoning.nextLine();

        season = season.toLowerCase();

        switch (season){
            case "spring":
                System.out.println("The flower are blooming how nice!");
                break;

            case "summer":
                System.out.println("It's sunny and hot, time for the beach!");
                break;

            case "fall":
                System.out.println("Leaves are falling, it's windy!");
                break;

            case "autumn":
                System.out.println("Leaves are falling, it's windy!");
                break;

            case "winter":
                System.out.println("Cold and Snowy, let's build a snow man!");
                break;

            default:
                System.out.println("I have never heard of this Season before!");
                break;
        }
        seasoning.close();
    }
}
