import java.util.*;
class q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int a=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            a=a+arr[i];
        }
        System.out.println(a);

    }
}