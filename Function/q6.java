import java.util.*;
class q6
{
    public static void SumOfOdd(int n)
    {
        if(n/2!=0)
        {
            int a=0;
            for(int i=n;i>=1;i--)
            {
                a=a+i;
            }
            System.out.print(a);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SumOfOdd(n);
    }
}