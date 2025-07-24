package Arrays;
import java.util.*;
import java.util.Arrays;
public class TopKFrequentlyElements {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,2,3,2,2,2,2,2,1,1,1,1,1};
        int k=3;
        int[] result= topKFrequent(nums,k);
        System.out.println(Arrays.toString(result));
    }
//count frequency
    public static int[] topKFrequent(int[] nums, int topk){
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int num:nums){
           freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
//map values to store frequency of each element like 1, 3-> 1 appeared thrice
////sort the array
//        List<Map.Entry<Integer,Integer>> entryList=new ArrayList<>(freqMap.entrySet());
//        entryList.sort((a,b)->b.getValue()-a.getValue()); //descending
//        int[] result=new int[topk];
//        for (int i=0;i<topk;i++){
//            result[i]=entryList.get(i).getKey();
//        }
//        return result;
//    }
////better- minHeap and optimal- BucketSort
//
//bucket list which contains an array list for particular index to store the elements occurred at same freq.
List<Integer>[] buckets= new List[nums.length+1];
    for(int i=0;i<buckets.length;i++){
        buckets[i]=new ArrayList<>();
    }
//value added to buckets as per frequency count to the same index
    for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
        int num= entry.getKey();
        int value= entry.getValue();
        buckets[value].add(num);
    }
    //collect top k elements in List result.
    List<Integer> result= new ArrayList<>();
    for(int i= buckets.length-1;i>=0&&result.size()<topk;i--){
        for(int num:buckets[i]){
            result.add(num);
            if (result.size() == topk) break;
        }
    }
//display the result , comvert list result to array
        int[] topkele= new int[topk];
        for(int i=0;i<topk;i++){
            topkele[i]=result.get(i);

        }
        return topkele;
    }

}