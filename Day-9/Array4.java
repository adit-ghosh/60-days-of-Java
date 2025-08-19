import java.util.*;
public class Array4 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,56,7};
        System.out.println(Arrays.toString(nums));
        
        String[] names = {"John", "Jane", "Doe"};
        System.out.println(Arrays.toString(names));
        
        Arrays.sort(nums);
        Arrays.sort(names);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));

    }
    
}
