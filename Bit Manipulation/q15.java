import java.util.*;
class q15
{
    public static void main(String[] args)   //Count Set Bits In A Number.(15=01111 output=4, 16=10000 output=1)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Number - ");
        int n=sc.nextInt();
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        System.out.print(count);
    }
}