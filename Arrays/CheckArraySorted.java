package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }

        boolean isSorted=true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}