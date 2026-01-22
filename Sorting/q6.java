import java.util.*;
class q6
{
    static void Sorting(int n, int arr[])
    {
        System.out.println("Before Bubble Sort - ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Bubble Sort - ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit - ");
        int n=sc.nextInt();
        System.out.println("Enter Elements - ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Sorting(n,arr);
    }
}