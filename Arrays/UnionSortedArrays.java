package Arrays;

import java.util.*;

public class UnionSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 5, 7, 7, 8, 8, 9, 0, 5, 3, 32, 34, 5, 66};

        // Brute force using Set
        Set<Integer> unionSet = new LinkedHashSet<>();

        for (int i : arr1) {
            unionSet.add(i);  // add each element to set
        }

        for (int i : arr2) {
            unionSet.add(i);  // duplicates are auto ignored
        }

        System.out.println("Union of the two arrays: " + unionSet);
    }
}
