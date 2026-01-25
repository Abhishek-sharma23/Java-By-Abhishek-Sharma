import java.util.*;
class q2
{
    static void Array(int n, int m, int arr[][], int key)
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
        boolean found=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.print("Found at cell ("+i+","+j+")");
                    found=true;
                    return;
                }
            }
        }
        if(!found)
        {
            System.out.print("Key Not Found.");
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
        System.out.println("Enter Array Elements - ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter Key - ");
        int key=sc.nextInt();
        Array(n,m,arr,key);
    }
}