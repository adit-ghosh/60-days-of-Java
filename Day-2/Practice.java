public class Practice {
    public static void main(String[] args) {
        double shapeValue = 42.75;
        System.out.println("Current Shape (double): "+shapeValue);
        System.out.println("Transforming shapes...");
        int intShape = (int) shapeValue;
        long longShape = (long) shapeValue;
        float floatShape = (float) shapeValue;
        System.out.println("Transformed into int: " + intShape);
        System.out.println("Tranformed into long: " + longShape);
        System.out.println("Transformed into float: " + floatShape);
        }
}
