import java.util.*;
class q3
{
    static void Sorting(int arr[], int n)
    {
        System.out.println("Before Selection Sort - ");     //Selection Sort
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        System.out.println();
        System.out.println("After Selection Sort - ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
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
        Sorting(arr,n);
    }
}