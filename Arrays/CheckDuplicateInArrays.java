package Arrays;
import java.util.HashSet;
public class CheckDuplicateInArrays {
    public static void main(String[] args) {
        int[] nums={1,2,34,3,2,21};
        HashSet <Integer> seen= new HashSet<>();
        for( int num:nums){
            if(seen.contains(num)){
                System.out.println("Duplicate value found in array");
            }
            seen.add(num);
        }
        System.out.println("After removing the duplicates array becomes" +seen);

    }

}
