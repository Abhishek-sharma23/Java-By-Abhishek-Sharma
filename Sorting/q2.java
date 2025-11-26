import java.util.*;
class q2
{
    static void Sorting(int arr[], int n)
    {
        System.out.println("Before Bubble Sort - ");    //Bubble Sort
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int swap=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        }
        System.out.println(" ");
        System.out.println("After Bubble Sort - ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Total sorting operation performed in array - "+swap);
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