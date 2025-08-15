public class DecimalDatatypes {
    public static void main(String[] args) {
        // float, double

        // Decimal types are considered double by default in Java, so we need to use 'f' or 'F' for float literals.

        // float -> 32 bits
        // float price = 19.99; // This will cause an error because float requires 'f' or 'F' suffix
        float price = 19.99f; // This is valid [Great to store something like a product price]
        System.out.println(price);

        // double -> 64 bits
        double distance = 12345.6789; // This is valid [Great to store something like a distance]
        //It is a more precise float
        System.out.println(distance);
    }
    
}
