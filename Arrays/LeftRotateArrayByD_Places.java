package Arrays;
import java.util.Arrays;
public class LeftRotateArrayByD_Places {
    public static void main(String[] args) {
        //d - places for left rotation
        int[] arr={1,2,3,4,5,6,7};

        int d=3;
        System.out.println("array entered before rotation " +Arrays.toString(arr));
        arr=LeftRotate(arr ,3);
        System.out.println("after rotation " +Arrays.toString(arr));

    }

    private static int[] LeftRotate(int[] arr, int d) {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    public static void reverse(int[] arr , int start , int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }



////this is a brute force approach..
//    public static void LeftRotate(int[] arr, int n,int d){
//        d=d%n;
//        int[] temp=new int[d];
//        for(int i=0;i<d;i++){
//            temp[i]=arr[i];
//        }
//        for(int i=d;i<n;i++ ){
//            arr[i-d]=arr[i];
//        }
////        for(int i=n-d;i< n;i++){
////            arr[i]=temp[i-(n-d)];
////        } OR
//
//        for(int i=0;i<d;i++){
//            arr[n-d+i]=temp[i];
//        }
//    }



}


