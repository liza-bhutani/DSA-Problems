// program to differentiate between lowercase,uppercase and digit..
public class char_operations{
    public static void test(char ch){
    if(ch<=48 && ch<=57){
        System.out.println("this is a digit ");
        
    }
     else if( ch>=65 && ch<=90){
        System.out.println("this is a uppercase character");
    }
     else if(ch<=97 && ch<=122){
        System.out.println(" this is a lowercase character");
    }
    else{
        System.out.println("you have entered a special character");
    }
}}
