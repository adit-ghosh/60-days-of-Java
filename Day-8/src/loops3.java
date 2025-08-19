import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        // fibonacci sequence
        //0 1 1 2 3 5 8 13
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();

        int firstTerm = 0, secondTerm =1;
        if(terms == 1){
            System.out.println(firstTerm);
        }else{
            System.out.print(firstTerm+ " "+secondTerm);
            for(int i=3; i<=terms; i++){
                int nextTerm = firstTerm+secondTerm;
                System.out.print(" "+nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println();
        }


        input.close();
    }
}
