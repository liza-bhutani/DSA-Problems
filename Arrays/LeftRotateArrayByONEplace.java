package Arrays;
import java.util.Arrays;
public class LeftRotateArrayByONEplace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        System.out.println("Rotated array result: " + Arrays.toString(arr));
    }
    public static int[] rotate(int[] nums) {
        int temp = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i];
        }
        nums[n - 1] = temp;
        return nums;
    }
}
