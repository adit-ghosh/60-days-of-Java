public class MoreStringMethods {
    public static void main(String[] args) {
        String phrase = "The quock brown fox";

        // Replace
        String newPhrase = phrase.replace("o","a");
        System.out.println("Original phrase: " + phrase);
        System.out.println("New phrase: " + newPhrase);

        // Uppercase
        String upperCaseString = phrase.toUpperCase();
        System.out.println("Capitalized phrase: " + upperCaseString);

        // Lowercase
        String lowerCaseString = phrase.toLowerCase();
        System.out.println("Lowercase phrase: " + lowerCaseString);
    }
    
}
