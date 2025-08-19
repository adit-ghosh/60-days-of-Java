public class Array3 {
    public static void main(String[] args) {
        int[] numbers = {1,12,33,45,5,7};

        System.out.println(args.length);

        //Sum of all elements
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        System.out.println("The sum of all elements in the array is: "+sum);

        //Maximum
        int max = numbers[0];
        for(int number:numbers){
            if (number>max){
                max = number;
            }
        }
        System.out.println("Maximum number is: "+ max);
        
        //Minimum
        int min = numbers[0];
        for(int number:numbers){
            if (number<min){
                min = number;
            }
        }
        System.out.println("Minimum number is: "+ min);
    }
}
