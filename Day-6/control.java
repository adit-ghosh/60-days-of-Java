public class control {
    public static void main(String[] args) {
        int number = 10;

        if(number%2 == 0){
            System.out.println("Number is even!");
        } else {
            System.out.println("Number is odd!");
        }

        if (number>0){
            System.out.println("Number is positive");
        } else{
            if(number<0){
            System.out.println("Number is negative");
            } else {
                System.out.println("Number is 0");
            }
        }

        if (number>0){
            System.out.println("Number is positive");
        } else if (number<0){
            System.out.println("Number is negative");
        } else{
            System.out.println("Number is 0");
        }

        // Ternary Operator
        String expression1 = (number>0)? "Number is Positive": "Number is Negative";
        String expression = (number>0)? "Number is Positive": (number<0) ? "Number is Negative" : "Number is 0";
        System.out.println(expression1);
        System.out.println(expression);
    }
}