 // program to tabular the function :f(X) =(x^2+1.5x+5)/(x-3), for x=-10 to 10. x should take the values -10,-8,-6------------6,8,1{
    public class quadratic_eq{
        public static void main(String[]args){
    int x=0;
     double fx;
     for(x=-10;x<=10;x=x+2){
         fx= (x*x+1.5*x+5)/(x-3);
             System.out.println( "the value for f(X) is " + fx);   
     }
 }}