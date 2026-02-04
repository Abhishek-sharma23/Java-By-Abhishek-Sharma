import java.util.*;
class q12
{
    public static void main(String[] args)   //Clear Last i Bit
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number - ");
        int n=sc.nextInt();
        System.out.print("Enetr Bit Position  - ");
        int i=sc.nextInt();
        int BitMask=(~0)<<i;
        System.out.print(n&BitMask);
    }
}