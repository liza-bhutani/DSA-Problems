package Arrays;
import java.util.Arrays;
public class MaximumSubArrayKadaneAlgorithm {
    public static void main(String[] args) {
//        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int maxEnding = Integer.MIN_VALUE;
        int[] arr = {-2, -3, -1};
        int maxEnding=0;

        int sum = 0;int start=0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) start = i;
            sum = sum + arr[i];

            if (sum > maxEnding) {
                maxEnding = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            sum+=arr[i];
//
//            if(sum>maxEnding){
//                maxEnding=sum;
//            }
//
//            if(sum<0){
//                sum=0;
//            }
//        }
        System.out.println("Maximum Subarray value is" +maxEnding);
    }
}