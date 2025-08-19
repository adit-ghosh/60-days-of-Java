
import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 1, 4};
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums, 45);
        System.out.println("Index of 8: " + index); 
    }
    
}
