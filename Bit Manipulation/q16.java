import java.util.*;
class q16
{
    public static void main(String[] args)   //Fast Exponentiation
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Base - ");
        int n=sc.nextInt();
        System.out.print("Enter Exponent - ");
        int a=sc.nextInt();
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.print(ans);
    }
}