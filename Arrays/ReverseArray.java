package Arrays;

import java.util.Arrays;

public class ReverseArray {
    // In-place reverse method (Best approach)
    public static void reverseInPlace(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        reverseInPlace(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
