public class loops6 {
    public static void main(String[] args) {
        //break
        for (int i = 1; i < 6; i++) {
            if(i==3){
                break;
            }
            System.out.println(i);
            System.out.println("Next Array\n");
        }

        //continue
        for (int i = 1; i < 6; i++) {
            if(i==3){
                System.out.println("We ignore this one");
                continue;
            }
            System.out.println(i);
            System.out.println("Next Array\n");
        }
        //Labels
        outerLoop:
        for (int i = 1; i <=3 ; i++) {
            innerLoop:
            for (int j = 1; j <= 3; j++) {
                if(i==2 && j == 2){
                    continue outerLoop;
                }
                System.out.println("i: "+i+" j: "+j);
            }

        }

        System.out.println("After the for loop");
    }
}
