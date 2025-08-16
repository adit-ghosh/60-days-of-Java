import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P,R,T;
        double SI;
        String Res;

        System.out.print("Enter principal amount: ");
        P = input.nextInt();
        input.nextLine();

        System.out.print("Enter annual interest rate (in percentage): ");
        R = input.nextInt();
        input.nextLine();

        System.out.print("Enter time period (in years): ");
        T = input.nextInt();
        input.nextLine();

        SI = (P*R*T)/100;

        Res = String.format("Simple Interest: $%.1f", SI);
        System.out.println(Res);

        input.close();
    }
    
}
