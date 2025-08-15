public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting from int to double
        int numInt = 10;
        System.out.println(numInt);
        double numDouble = numInt; // Implicit casting
        System.out.println(numDouble);

        //Explicit Casting from double to int(with loss!)
        double numDouble2 = 10.5;
        System.out.println(numDouble2);
        int numInt2 = (int) numDouble2; // Explicit casting
        System.out.println(numInt2);
    }
}
