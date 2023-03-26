import java.util.*;
public class method{
    void demomethodtest(){
        Scanner ab= new Scanner(System.in);
        int a= ab.nextInt();
        int b= ab. nextInt();
        int c= method.maximum(a,b);
        System.out.println("greater among both of them" +c);
        //function or method ends here ..
    }
        public static int maximum(int a, int b){
         int ans;
         ans=(a>b)?a:b;
         return ans;
         
        }
        
        
    
    }
