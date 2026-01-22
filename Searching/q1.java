import java.util.*;
class q1
{
    static void Pat(int arr[], int n, int key)
    {
        int index=-1;                                   //Linear Search.
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                index=i;
            }
        }
        if(index>=0)
        {
            System.out.println("The element is on index no. - "+index);
        }
        else 
        {
            System.out.println("There is no such element.");
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
        Pat(arr,n,key);
    }
}