import java.util.ArrayList;

public class $2DArrays5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dates");

        System.out.println(fruits.get(3));

        boolean hasFruit = fruits.contains("banana");
        System.out.println(hasFruit);

        System.out.println(fruits.size());


        fruits.remove("Cherry");
        fruits.remove(0);

        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
