import java.util.Scanner;
// import java.io.*;

public class MultiDimensionalArray {
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row number :");
        int r=sc.nextInt();
        
        System.out.println("Enter columns values :");
        int c=sc.nextInt();

        System.out.println("Enter the multidimensional arry values :");
        int matrixArray[][]=new int[r][c];        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrixArray[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matrixArray[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    
}
