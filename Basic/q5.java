import java.util.*;
class q5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number - ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number - ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd Number - ");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.print(a+" Is Max");
        }
        else if(b>c)
        {
            System.out.print(b+" Is Max");
        }
        else
        {
            System.out.print(c+" Is Max");
        }
    }
}