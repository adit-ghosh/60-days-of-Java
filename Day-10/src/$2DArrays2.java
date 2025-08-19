public class $2DArrays2 {
    public static void main(String[] args) {
        int[][] My2D = {
                {1,2,3,4},
                {4,5,6},
                {7,8,9}
        };


        for (int i = 0; i < My2D.length/*rows*/; i++) {
            for (int j = 0; j < My2D[i].length/*columns*/; j++) {
                System.out.print(My2D[i][j] + " ");

            }
            System.out.println();
        }
    }
}
