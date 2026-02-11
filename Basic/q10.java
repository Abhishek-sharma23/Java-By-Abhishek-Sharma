import java.util.*;
class q10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Number To Print Factorial - ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);
    }
}