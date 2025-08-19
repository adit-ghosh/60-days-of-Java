public class Enum1 {
    public enum Day{
        MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public enum CoffeSize{
        SMALL, MEDIUM, LARGE, VENTI
    }
    public static void main(String[] args) {
        CoffeSize size = CoffeSize.LARGE;
        double price;
        switch (size){
            case SMALL -> price = 2.50;
            case MEDIUM -> price = 3.00;
            case LARGE -> price = 3.50;
            case VENTI -> price = 4.00;
            default -> price = 420.69;
        }
        System.out.printf("The price for your coffee is $%.2f%n",price);
    }
}
