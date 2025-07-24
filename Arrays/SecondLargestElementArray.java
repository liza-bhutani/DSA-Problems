package Arrays;
import java.util.*;
import java.util.Arrays;

public class SecondLargestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("largest element in array is" + maxArray(arr));
        System.out.println("second largest element in array is" + second_max_array(arr));
    }

    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int second_max_array(int[] arr){
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }else if(arr[i]>second && arr[i]!=max){
                second=arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements might be the same).");
            return -1;
        }
        return second;
    }
    public static int second_min_array(int[] arr){
        int min=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                second=min;

                min=arr[i];
            }else if(arr[i]>second && arr[i]!=min && second<min){
                second=arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements might be the same).");
            return -1;
        }
        return second;
    }
}
