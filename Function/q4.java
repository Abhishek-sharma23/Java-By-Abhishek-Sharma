import java.util.*;
class q4
{
    public static void facto(int n)
    {
        if(n<0)
        {
            System.out.print("Invalid Number");
            return;
        }
        int a=1;
        for(int i=n;i>=1;i--)
        {
            a=a*i;
        }
            System.out.print(a);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        facto(n);
    }
}