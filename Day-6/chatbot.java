import java.util.Scanner;
public class chatbot {
    public static void main(String[] args) {
        Scanner chat = new Scanner(System.in);

        System.out.println("Plase enter something");
        String user = chat.nextLine();

        if (user.equalsIgnoreCase("hello") || user.equalsIgnoreCase("hi")){
            System.out.println("Hi Brother!");
        }
        else if(user.equalsIgnoreCase("how are you") || user.equalsIgnoreCase("how is it going")){
            System.out.println("Noice!");
        }
        else{
            System.out.println("404 error");
        }
        chat.close();
    }
}