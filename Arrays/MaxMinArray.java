package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Maximum  value element in Array is " +maxArray(arr));
        System.out.println("Minimum value element in Array is " +minArray(arr));
        System.out.println("Enter start index for maxInRange:");
        int start = sc.nextInt();
        System.out.println("Enter end index for maxInRange:");
        int end = sc.nextInt();
        if (start >= 0 && end < arr.length && start <= end) {
            System.out.println("Maximum value in the range [" + start + ", " + end + "] is " + maxInRange(arr, start, end));
        } else {
            System.out.println("Invalid range entered.");
        }
    }
    public static int maxArray(int[] arr){
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int minArray(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int maxInRange(int[] arr,int start, int end){

        int max= arr[0];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


}
