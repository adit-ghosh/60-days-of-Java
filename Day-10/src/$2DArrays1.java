public class $2DArrays1 {
    public static void main(String[] args) {
        int[][] My2D = new int[3][3];
        My2D[0][0] = 1;
        My2D[0][1] = 2;
        My2D[0][2] = 3;
        My2D[1][0] = 4;
        My2D[1][1] = 5;
        My2D[1][2] = 6;
        My2D[2][0] = 7;
        My2D[2][1] = 8;
        My2D[2][2] = 9;

        for (int i = 0; i < My2D.length/*rows*/; i++) {
            for (int j = 0; j < My2D[i].length/*columns*/; j++) {
                System.out.print(My2D[i][j] + " ");

            }
            System.out.println();
        }
    }
}
