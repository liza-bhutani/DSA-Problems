//class Solution {
//    public int search(int[] nums, int target) {
//        int n=nums.length;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}

//above is the logic only but takes 0(n) timecomlexity which is quite large for large arrays.

package Arrays;
import java.util.Scanner;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();

        // Call search method
        int result = search(nums, target);
        System.out.println("Target found at index: " + result);
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            // Avoids overflow
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Not found
    }
}
