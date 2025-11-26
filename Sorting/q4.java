import java.util.*;
class q4
{
    static void Sorting(int arr[], int n)
    {
        System.out.println("Before Insertion Sort - ");     //Insertion Sort
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=1;i<n;i++)
        {
            int a=arr[i];
            int b=i-1;
            while(b>=0 && arr[b]>a)
            {
                arr[b+1]=arr[b];
                b--;
            }
            arr[b+1]=a;
        }
        System.out.println();
        System.out.println("After Insertion Sort - ");
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