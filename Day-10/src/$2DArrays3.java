public class $2DArrays3 {
    public static void main(String[] args) {
        int[][] My2D = {
                {1,2,3,4},
                {4,5,6},
                {7,8,9}
        };

        /*rows*/
        for (int[] rows : My2D) {
            /*columns*/
            for (int elements : rows) {
                System.out.print(elements + " ");

            }
            System.out.println();
        }
    }
}
