public class OperatorPrecedenceandAssociativity {
    public static void main(String[] args) {
        int a = 10, b =5, c =2;

        int result = a + b * c;
        System.out.println("Result is: " + result);
        
        result = (a + b) * c;
        System.out.println("Result is: " + result);

        int x =10, y =5, z =2;
        int result1 = x -y -++z;
        System.out.println("Result1 is: " + result1);
        result1 += x -(y - z);
        System.out.println("Result1 is: " + result1);
    }
    
}
