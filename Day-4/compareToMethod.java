public class compareToMethod {
    public static void main(String[] args) {
        String animal1 = "Cat", animal2 = "Dog", animal3 = "Cat";


        // Lexicographical comparison (Dictionary order)
        System.out.println("Comparing animal1 and animal2: " + animal1.compareTo(animal2));
        System.out.println("Comparing animal2 and animal1: " + animal2.compareTo(animal1));
        System.out.println("Comparing animal1 and animal3: " + animal1.compareTo(animal3));
        System.out.println("Comparing animal3 and animal1: " + animal3.compareTo(animal1));

    }
    
}
