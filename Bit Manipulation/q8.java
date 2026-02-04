import java.util.*;
class q8
{
    public static void main(String[] args)            //Get ith Bit.
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Number - ");
        int n=sc.nextInt();
        System.out.print("Enter bit position - ");
        int i = sc.nextInt();
        int BitMask=1<<i;
        if((n&BitMask)==0)
        {
            System.out.print(0);
        }
        else
        {
            System.out.print(1);
        }
    }
}