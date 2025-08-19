import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pick a number between 1 to 10: ");
        int num = input.nextInt();

        int length = num * 2;
        int[] numbers = new int[length];

        // input array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter an element: ");
            numbers[i] = input.nextInt();
        }

        // print original array
        System.out.print("Array [not shuffled]: {");
        for (int element : numbers) {
            System.out.print(element + ", ");
        }
        System.out.println("}");

        // create shuffled array
        int[] shuffled = new int[length];
        int mid = length / 2;
        for (int i = 0; i < mid; i++) {
            shuffled[2 * i] = numbers[i];       // take from first half
            shuffled[2 * i + 1] = numbers[i + mid]; // take from second half
        }

        // print shuffled array
        System.out.print("Array [shuffled]: {");
        for (int element : shuffled) {
            System.out.print(element + ", ");
        }
        System.out.println("}");

        input.close();
    }
}
