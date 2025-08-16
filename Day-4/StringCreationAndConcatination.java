public class StringCreationAndConcatination{
    public static void main(String[] args) {
        String morning = "Good Morning!";
        System.out.println(morning);

        String night = new String("Good Night!");
        night = "Bad Night!";
        
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        int age = 30;
        String bio = "I am "+fullName + " and am " + age + " years old."; //Converts int to string
        System.out.println(bio);

    }
}