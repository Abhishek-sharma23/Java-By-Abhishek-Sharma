import java.util.*;
class q9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number To Print Table - ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+(i*n));
        }
    }
}