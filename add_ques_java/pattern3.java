/* pattern ...
 1
 2 2 
 3 3 3 
 4 4 4 4 
 5 5 5 5 5*/
 
public class pattern3{
      public static void main(String[]args){
        System.out.println("printing the pattern ");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>i){
                 continue;
                }
                else{
                    System.out.print(i );
                    
                }  
            
            }  System.out.println();
        }
      }
  }