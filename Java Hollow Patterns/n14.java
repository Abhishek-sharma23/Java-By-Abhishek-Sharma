import java.util.*;
public class n14
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j==1||i==j?"* ":"  ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j==1||i+j==n?"* ":"  ");
            }
            System.out.println();
        }
    }
}