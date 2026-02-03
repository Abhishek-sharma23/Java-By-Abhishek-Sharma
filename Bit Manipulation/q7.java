import java.util.*;
class q7
{
    public static void main(String[] args)      //Check odd or even Operator
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter 1st Number - ");
        int n=sc.nextInt();
        int a=1;
        if((n&a)==0)
        {
            System.out.print("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}