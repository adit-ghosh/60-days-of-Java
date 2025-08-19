import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int[] num = new int[5];
        int[] num1 = new int[7];
        Arrays.fill(nums, 10);
        System.out.println(Arrays.toString(nums));
        Arrays.fill(num,0,3, 10);
        System.out.println(Arrays.toString(num));
        Arrays.fill(num1,0,3, 10);
        Arrays.fill(num1,3,num1.length, 69);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.equals(num,num1));
    }
    
}
