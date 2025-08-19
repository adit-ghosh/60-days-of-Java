public class Switch2 {
    public static void main(String[] args) {

        //Enhanced Switch Version
        int day = 4;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "N/A";
        };

        System.out.println("Today is "+dayName);

    }
}
