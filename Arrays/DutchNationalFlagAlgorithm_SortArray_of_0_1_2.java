package Arrays;
import java.util.Arrays;
public class DutchNationalFlagAlgorithm_SortArray_of_0_1_2 {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,0,0,2,1,1,1,2,0};
        int low=0,mid=0,high= arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
           else if(arr[mid]==2) {
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.println("Array after sorting is " +Arrays.toString(arr));
    }
    public static void swap(int[] arr , int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
