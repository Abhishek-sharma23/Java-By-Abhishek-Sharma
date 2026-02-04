import java.util.*;
class q9
{
    public static void main(String[] args)            //Set ith Bit.
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Number - ");
        int n=sc.nextInt();
        System.out.print("Enter bit position - ");
        int i = sc.nextInt();
        int BitMask=1<<i;
        System.out.print(n|BitMask);
    }
}