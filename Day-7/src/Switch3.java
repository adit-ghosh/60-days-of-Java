public class Switch3 {
    //Fall Through
    public static void main(String[] args) {

        int day = 5;


        switch(day) {
            case 1:
                System.out.println("Monday: Work on Project A");
                break;
            case 2:
                System.out.println("Tuesday: Work on Project B");
                break;
            case 3:
                System.out.println("Wednesday: Write proposal");
                break;
            case 4:
                System.out.println("Thursday: Meetings All Day");
                break;
            case 5:
                System.out.println("Friday: Submit a Report");
//                break;
            case 6:
                System.out.println("Saturday: Relax");
                break;
            case 7:
                System.out.println("Sunday: Relax");
                break;
            default:
                System.out.println("Invalid Day.");;
                break;
        }

    }
}

