import java.util.*;
class n27
{
    public static void main(String[] args)
    {
        Scanner abhi=new Scanner(System.in);
        int n=abhi.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}