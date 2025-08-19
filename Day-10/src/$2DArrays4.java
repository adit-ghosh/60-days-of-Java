public class $2DArrays4 {
    public static void main(String[] args) {
        int[][] My2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int largest = My2D[0][0];
        int smallest = My2D[0][0];
        int sum = 0;
        /*rows*/
        for (int[] rows : My2D) {
            /*columns*/
            for (int elements : rows) {
                if(elements>largest){
                    largest = elements;
                }
                if(elements<smallest){
                    smallest=elements;
                }
                sum+=elements;
            }
        }
        System.out.println("Greatest Number: "+largest);
        System.out.println("Smallest Number: "+smallest);
        System.out.println("Sum: "+sum);
    }
}
