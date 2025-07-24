package Arrays;
import java.util.*;
public class SwapValueInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is " +Arrays.toString(arr));
        System.out.println("Enter first index to swap:");
        int index1 = sc.nextInt();
        System.out.println("Enter second index to swap:");
        int index2 = sc.nextInt();
        swap(arr, index1, index2);
        System.out.println("Array after swap: " + Arrays.toString(arr));
    }
//    int [] arr1={1,2,3,4,5,6};
    static void swap(int [] arr ,int index1 ,int index2){
     if(index1<=0|| index1>= arr.length ||index2<0 ||index2>=arr.length){
         System.out.println("Invalid indices provided for swap as per array size");
        }
     int temp=arr[index1];
     arr[index1]=arr[index2];
     arr[index2]=temp;
    }
}

