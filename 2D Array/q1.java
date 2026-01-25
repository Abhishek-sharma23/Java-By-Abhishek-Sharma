import java.util.*;
class q1
{
    static void Array(int n, int m, int arr[][])
    {
        System.out.println("Array Elements Are - ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter 1st Limit - ");
        int n=sc.nextInt();
        System.out.print("Enter 2nd Limit - ");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter Elements - ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Array(n,m,arr);
    }
}