
// calculating the sum of first n natural numbers;;
import java. util.*;
public class natural_num{
    public static void main(String[]args){
     int n;
     System.out.println("enter the value of number upto which you want to get the sum of natural numbers");
    Scanner sc= new Scanner(System.in);
    n= sc.nextInt();
    int i;
    int sum=0;
    
    for(i=0;i<=n;i++){
        sum+=i;
    } System.out.println("the value of sum of first n natural numbers are " +sum);
}
}
