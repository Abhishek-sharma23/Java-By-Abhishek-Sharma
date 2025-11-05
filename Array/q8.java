import java.util.*;
class q8
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
        Arrays.sort(arr);
        int a=arr[0];
        int b=arr[4];
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("First Max - "+(sum-a));
        System.out.println("Second Max - "+(sum-b));
    }
}