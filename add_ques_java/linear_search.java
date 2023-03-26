public class linear_search{
    public void lsearch( int n){
        int arr[]= {5,4,3,6,7,8,9,0};
        int flag=0;
        int i;
        for( i=0;i<8;i++){
            if(n==arr[i]){
                flag=1;
                break;
            }
        }
        if(flag==1){
        System.out.println("the value of position of" + n + "is " +(i+1));}
         else{
             System.out.println(" element not found:");
             
         }
            
        }
    }
    /*linear search refers to the searching technique in which each element of an array is compared with search item , one by one , until 
      the search items have been found..*/