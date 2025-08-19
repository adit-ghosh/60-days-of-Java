import java.util.Scanner;

public class loops7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum=0, digit, orginalNum=num ;
        while(num!=0){
            digit = num%10;
            sum+=digit;
            num/=10;
        }

        if(orginalNum%sum == 0){
            System.out.println("The given nuber is a Harshad Number!");
        }else{
            System.out.println("The given nuber is not a Harshad Number!");

        }


        input.close();
    }
}
