import java.util.*;
class q5
{
    static void Sorting(int arr[], int n)
    {
        System.out.println("Before Counting Sort - ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            large=Math.max(large,arr[i]);
        }
        int count[]=new int[large+1];
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<=large;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        System.out.println();
        System.out.println("After Counting Sort - ");
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