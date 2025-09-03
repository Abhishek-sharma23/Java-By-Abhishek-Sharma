import java.util.*;
class q7
{
    public static void grater(int a, int b)
    {
        if(a>b)
        {
            System.out.print(a);
        }
        else
        {
            System.out.print(b);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        grater(a,b);
    }
}