package Strings;
import java.util.*;
public class GroupAnagram {
    public static void main(String[] args) {
        String[] input={"eat","tea","ate","cat","act","listen","silent"};
        List<List<String>> result= groupAnagram(input);
        System.out.println("group anagrams are "+result);
    }

    static List<List<String>> groupAnagram(String []args) {
        List<List<String>> result = new ArrayList<>();
        for (String s : args) {
            String sorted = sortString(s);
            boolean added = false;
            for (List<String> group : result) {
                String sortedGroupHead = sortString(group.get(0));
                if (sorted.equals(sortedGroupHead)) {
                    group.add(s);
                    added=true;
                    break;
                }
            } if(!added){
                List<String> newGroup=new ArrayList<>();
                newGroup.add(sorted);
                result.add(newGroup);
            }
        }
        return result;
    }

    static String sortString(String str){
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }


    //optimal approach-
    //class Solution {
    //    public List<List<String>> groupAnagrams(String[] strs) {
    //        Map<String, List<String>> map = new HashMap<>();
    //        for (String str : strs) {
    //            char[] chars = str.toCharArray();
    //            Arrays.sort(chars);
    //            String key = new String(chars);
    //            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
    //        }
    //
    //        return new ArrayList<>(map.values());
    //    }
    //}
}
