import java.util.Scanner;
public class Nestedifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Variable a: ");
        int a = input.nextInt();
        System.out.print("Enter Variable b: ");
        int b = input.nextInt();

        System.out.println("a: "+a+" b: "+b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("a: "+a+" b: "+b);
        input.close();

//        int a = 5;
//        int b = 4;
//        if(a>0){
//            if(b>a){
//                System.out.println("B is greater than a");
//            }
//        }
//        System.out.println("After if statemnt");
//    }
}