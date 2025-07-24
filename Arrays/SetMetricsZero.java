package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SetMetricsZero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row size of matrix");
        int row_size= sc.nextInt();
        System.out.println("Enter the col size of metrix");
        int col_size=sc.nextInt();
        int [][]arr= new int[row_size][col_size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<row_size;i++){
            System.out.println("Enter the elements of " +i+ "row");
        for (int j = 0; j < col_size; j++) {
            System.out.println("Enter the value of " +i+ "th row and " +j+ "column");
            arr[i][j]=sc.nextInt();
        }
        }
        System.out.println("Metrics entered is ");
        for(int i=0;i<row_size;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        setzero(arr);
        System.out.println("Set Metrics zeroes result is ");
        for(int i=0;i<row_size;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void setzero(int[][] matrix){
        int n= matrix.length;
        int m=matrix[0].length;
        boolean col0=true;

        //mark rows and cols if 0 is there
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0) col0=false;
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        //set cells to 0 based on markers defined above
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=1;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(!col0) matrix[i][0]=0;
        }
    }
}
