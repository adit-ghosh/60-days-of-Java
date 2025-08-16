import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your monthly income: $");
        double inc = input.nextDouble();
        input.nextLine();

        System.out.print("Enter your monthly rent: $");
        double rent = input.nextDouble();
        input.nextLine();

        System.out.print("Enter your monthly groceries expenses: $");
        double grcs = input.nextDouble();
        input.nextLine();

        System.out.print("Enter your monthly transportation expenses: $");
        double trans = input.nextDouble();
        input.nextLine();

        System.out.print("Enter your monthly entertainment expenses: $");
        double entrmnt = input.nextDouble();
        input.nextLine();

        double ttlExp, rmnBdgt;
        System.out.println("\n********** Budget Summary **********");
        System.out.println("Monthly Income: $"+inc);
        System.out.println("Total Expenses: $"+(rent+grcs+trans+entrmnt));
        System.out.println("Remaining Budget: $"+(inc-(rent+grcs+trans+entrmnt)));
        System.out.println("Expenses Breakdown: ");
        System.out.println("\tRent: "+rent+" ("+((rent)*100/(rent+grcs+trans+entrmnt))+"% of income)");
        System.out.println("\tGroceries: "+grcs+" ("+((grcs)*100/(rent+grcs+trans+entrmnt))+"% of income)");
        System.out.println("\tTransportation: "+trans+" ("+((trans)*100/(rent+grcs+trans+entrmnt))+"% of income)");
        System.out.println("\tEntertainment: "+entrmnt+" ("+((entrmnt)*100/(rent+grcs+trans+entrmnt))+"% of income)");
        System.out.println("************************************");
    }
}
