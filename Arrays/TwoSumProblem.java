package Arrays;
import java.util.*;
public class TwoSumProblem {
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum to find out in the array");
        int target=sc.nextInt();
        int[] result=twoSum(arr,target);
        if(result.length>0){
            System.out.println("Sum exists at indices: " + result[0] + " and " + result[1]);
        }
        else {
            System.out.println("not exist -1");
        }
    }

//    //brute force approach
//    static int[] twoSum(int[] nums,int target){
//        for(int i=0;i< nums.length;i++){
//            for(int j=i+1;j< nums.length;j++){
//               if(nums[i]+nums[j]==target){
//                   return new int[]{i, j};
//               }
//            }
//        }
//        return new int[0];
//    }

static int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int complement= target-nums[i];
        if(map.containsKey(complement)){
            return new int[] {map.get(complement),i};
        }
        map.put(nums[i],i);
    }
    return new int[0];
}
}
