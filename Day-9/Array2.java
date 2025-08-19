public class Array2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        
        //Array Length
        System.out.println(numbers.length);
        
        //Traversing using for loop
        for (int i = 0; i < numbers.length;i++){
            // numbers[i]*=2;
            System.out.println(numbers[i]*2);
        }

        //Traveresing using for Each Loop
        for (int number: numbers){
            System.out.println(number);
        }

        String[] friends = {"Joey", "Chandler", "Ross", "Monica", "Rachel", "Pheobe"};

        for(String name : friends){
            System.out.println("Welcome to my party: "+name);
        }
    }
}
