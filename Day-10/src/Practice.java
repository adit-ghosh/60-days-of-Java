import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = input.nextInt();

        int mat[][] = new int[n][n];
        int digit = 1;

        // Fill matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = digit++;
            }
        }

        // Print matrix
        for (int[] rows : mat) {
            for (int elem : rows) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // Extract primary diagonal
        int prmyDg[] = new int[n];
        for (int i = 0; i < n; i++) {
            prmyDg[i] = mat[i][i];   // no need for nested loop
        }

        System.out.println("Primary Diagonal: " + Arrays.toString(prmyDg));

        // Extract secondary diagonal (optional)
        int secDg[] = new int[n];
        for (int i = 0; i < n; i++) {
            secDg[i] = mat[i][n - 1 - i];
        }

        System.out.println("Secondary Diagonal: " + Arrays.toString(secDg));

        int sum = 0;
        for (int i = 0; i < prmyDg.length; i++) {
            sum+=prmyDg[i];
        }
        for (int i = 0; i < secDg.length; i++) {
            sum+=secDg[i];
        }

        System.out.println("Total Sum: "+sum);
    }
}
