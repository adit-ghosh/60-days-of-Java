public class UnaryOperators {
    public static void main(String[] args) {
        //Unary Operators
        int a = 5;
        int c = 5;
        int negative = -a;
        System.out.println(negative);

        //Increment Operator (Post Increment)
        int b = a++;
        System.out.println(b);// Here b will be 5, once the value is used then, a will be 6
        System.out.println(a);
    
        //Increment Operator (Pre Increment)
        b = ++a;
        System.out.println(b);
        System.out.println(a);

        //Decrement Operator (Pre Decrement)
        int d = --c;
        System.out.println(d);
        System.out.println(c);

        //Decrement Operator (Post Decrement)
        d = c--;
        System.out.println(d);
        System.out.println(c);


    }
    
}
