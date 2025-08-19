import java.util.Arrays;
public class Array6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(nums));
        int[] backup = Arrays.copyOf(nums, nums.length); // copy of the original array
        nums[0] = 10; // modifying the original array
        System.out.println("Original array: " + Arrays.toString(backup));
        int[] refer = nums; // by refernce
        System.out.println("Original array: " + Arrays.toString(refer));
        int[] less = Arrays.copyOf(nums, 14);
        System.out.println("Less array: " + Arrays.toString(less));
    }
    
}
