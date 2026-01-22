import java.util.*;
class q2
{
    static void Binary(int arr[], int n, int key)
    {
        int start=0, end=n-1, index=-1;
        while(start<=end)
        {                                               //Binary Search
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                index=mid;
                break;
            }
            else if(arr[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        if(index==-1)
        {
            System.out.println("No such element found.");
        }
        else
        {
            System.out.println("Element found on index - "+index);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit - ");
        int n=sc.nextInt();
        System.out.println("Enter elements - ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Key - ");
        int key=sc.nextInt();
        Binary(arr,n,key);
    }
}