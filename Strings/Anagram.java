package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    //Brute Force Approach
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//       String s= sc.nextLine();
//       String t= sc.nextLine();
//       if(isAnagram(s,t)){
//           System.out.println("its anagram ");
//       }
//       else{
//           System.out.println("not anagram");
//       }
//
//    }
//    static boolean isAnagram(String s , String t ){
//        char sArray[]=s.toCharArray();
//        char tArray[]=t.toCharArray();
//        Arrays.sort(sArray);
//        Arrays.sort(tArray);
//        return Arrays.equals(sArray,tArray);
//
//    }

        String s =sc.nextLine();
        String t=sc.nextLine();
        int count[]=new int[26];

        if(isAnagram(s.toLowerCase(),t.toLowerCase())){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
    static boolean isAnagram(String s , String t ){
        if(s.length()!=t.length()){
            System.out.println("Not anagram");
        }
        int count []= new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
