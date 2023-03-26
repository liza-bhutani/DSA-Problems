 /*
  1
  1 2
  1 2 3 
  1 2 3 4 
  1 2 3 4 5 
  */
 
 
 
  public class pattern2{
      public static void main(String[]args){
        System.out.println("printing the pattern ");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==i){
                    System.out.print(i );
                }
                else  if (i>j){
                    System.out.print( j);
                }
            }  System.out.println();
        }
      }}