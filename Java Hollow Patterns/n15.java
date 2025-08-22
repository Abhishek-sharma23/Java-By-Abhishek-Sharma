import java.util.*;
public class n15
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j==1||i==j?"* ":"  ");
            }
            for(int k=1;k<=n-1;k++)
            {
                System.out.print(k==n-1||i+k==n?"* ":"  ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j==1||i+j==n?"* ":"  ");
            }
            for(int k=1;k<=n-1;k++)
            {
                System.out.print(k==n-1||i==k?"* ":"  ");
            }
            System.out.println();
        }
    }
}