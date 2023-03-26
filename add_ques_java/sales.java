public class sales{
    public static void test(float sales){
    double comm=0;
    if(sales>5000){
        if(sales>12000){
            if(sales>22000){
                if(sales>30000)
                comm= sales*0.15;
                else 
                comm= sales*0.10;
                
            }
            else
            comm= sales*0.07;
        }
        else
        comm= sales*0.03;
    }
    else
    comm=0;
    System.out.println("for sales" + sales + " the commision is" +comm);
}
public static void main(String args[]){
    test(3000);
    test(7000);
    test(22000);
    test(35000);
}
    }