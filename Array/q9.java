import java.util.*;
class q9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int arr1[]=new int[size];
        System.out.println("Enter 1st array elements - ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd array elements - ");
        for(int i=0;i<size;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int sum=0,sum1=0;
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                sum=sum+arr[i];
            }
        }
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                sum1=sum1+arr1[i];
            }
        }
        System.out.println("Sum of 1st array in even "+sum);
        System.out.println("Sum of 2nd array in even "+sum1);
        System.out.println("Sum of both array in even "+(sum+sum1));
    }
}