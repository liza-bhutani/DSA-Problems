import java.util.Arrays;
public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 0, 5, 6, 0, 5, 0};
        int n = arr.length;
        int j = -1;

        // Step 1: find the first zero index
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i; // first zero found at j
                break;
            }
        }

        // No zero found, already fine
        if (j == -1) {
            System.out.println("No zeroes to move");
        } else {
            // Step 2: swap non-zero elements with position j
            for (int i = j + 1; i < n; i++) {
                if (arr[i] != 0) {
                    // swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++; // move j to next zero
                }
            }

            // Output the result
            System.out.print("Array after moving zeroes: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}

        
        //below code is for brute force approach;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                temp[nz]=arr[i];
//                nz++;
//            }
//        }
//        for(int i=0;i<nz;i++){
//            arr[i ]=temp[i];
//        }
//        for(int i=nz;i<n;i++){
//            arr[i]=0;
//        }

