import java.util.*;
class q3
{
    public static void main(String[] args)                  //Spiral Metrix
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Array Elements - ");
        int arr[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int StartCol=0;
        int StartRow=0;
        int EndCol=arr.length-1;
        int EndRow=arr[0].length-1;
        while(StartRow<=EndRow && StartCol<=EndCol)
        {
            for(int j=StartCol;j<=EndCol;j++)
            {   
                System.out.print(arr[StartRow][j]+" ");
            }
            for(int i=StartRow+1;i<=EndRow;i++)
            {
                System.out.print(arr[i][EndCol]+" ");
            }
            for(int j=EndCol-1;j>=StartCol;j--)
            {
                if(StartRow==EndRow)
                {
                    break;
                }
                System.out.print(arr[EndRow][j]+" ");
            }
            for(int i=EndRow-1;i>=StartRow+1;i--)
            {
                if(StartCol==EndCol)
                {
                    break;
                }
                System.out.print(arr[i][StartCol]+" ");
            }
            StartCol++;
            StartRow++;
            EndRow--;
            EndCol--;
        }
    }
}