public class binary_search{
    public void  bisearch(int n){
        int a[]={ 2,4,6,8,10,12,14,16,18,20};
        int flag=0, L,U,M=0;// L denotes the lower limit nd similarly u stands for upper limit
        L=0;
        U=9;
        while(L<=U){
            M=(L+U)/2;
            if(n> a[M])
            L=M+1;
            else if(n<a[M])
            U=M-1;
            else 
            {
                flag=1;
                break;}
            
        }  if(flag==1)System.out.println("element present at position " +(M+1));
        else System.out.println("element not found");
        
        }
    }
    
    
    /* binary search is a special technique that works on sorted arrays whereas linear search can work for both sorted as well as unsorted 
      arrays.. */