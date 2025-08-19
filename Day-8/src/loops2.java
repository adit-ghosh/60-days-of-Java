import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int levels = input.nextInt();

        for (int i = 1; i <=levels ; i++) {
            for (int j = 0; j <levels-i; j++) {
                    System.out.print(" ");
            }
            for (int k = 0; k <2 * i - 1; k++) {
                    System.out.print("*");
            }
            System.out.println();
        }


        input.close();
    }
}
