import java.util.*;
class q11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Number - ");
        int n=sc.nextInt();
        int a=1;
        while(a<=n)
        {
            if(a%2==0)
            {
                System.out.print(a+" ");
            }
            a++;
        }
    }
}