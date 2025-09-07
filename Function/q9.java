import java.util.*;
class q9
{
    public static void Age(int n)
    {
        if(n>=18)
        {
            System.out.print("Eligible");
        }
        else
        {
            System.out.print("Not Eligible");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Age(n);
    }
}