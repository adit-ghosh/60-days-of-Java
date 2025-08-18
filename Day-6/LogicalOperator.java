public class LogicalOperator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean result = a && b; // AND
        result = a || b; //OR
        result = !a || b;
        System.out.println("a is: "+a+" and !a is " + !a);

        int c = 5;
        int d =10;
        // Short circuit logical operator
        if ((c>0)&&(d>c)){
            System.out.println("b is grater than a");
        }
    }
}