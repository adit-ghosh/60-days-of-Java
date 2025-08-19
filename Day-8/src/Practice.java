import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String userInput = input.nextLine().toLowerCase();

        int vowel=0, consonant=0, j=0;
        outerLoop:
        for (int i = 0; i < userInput.length(); i++) {
            innerLoop:
            while (true) {
                System.out.println("Do you want to continue? (yes to continue, no to exit)");
                String consent = input.nextLine().toLowerCase();

                if(consent.equals("yes")){
                    char Character = userInput.charAt(i);
                    if(Character == 'a' || Character == 'e' || Character == 'i' ||Character == 'o' || Character == 'u'){
                        vowel++;
                    }else{
                        consonant++;
                    }
                    break innerLoop;
                } else if (consent.equals("no")) {
                    break outerLoop;
                }else{
                    System.out.println("Invalid Choice!");
                    continue;
                }
            }
        }
        input.close();
        System.out.println("Total Vowels: "+vowel);
        System.out.println("Total Consonants: "+consonant);
    }
}
