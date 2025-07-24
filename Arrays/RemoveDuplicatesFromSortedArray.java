package Arrays;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 22, 33, 55, 43, 33, 55, 65};

        Arrays.sort(arr); // ✅ Step 1: Sort the array
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j]; // ✅ Only move unique elements
            }
        }

        // Print unique part
        System.out.print("Sorted array after removing duplicates: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
