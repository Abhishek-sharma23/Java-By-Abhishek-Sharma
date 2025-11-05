import java.util.*;
class q10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum of all odd numbers in array "+sum);
    }
}