import java.util.*;
public class n4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j==n||i+j==n+1?"* ":"  ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j==n||i==j-1?"* ":"  ");
            }
            System.out.println();
        }
    }
}