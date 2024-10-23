import java.util.*;
public class q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int a=n/2+1;
                System.out.print((j==1||j==2||i==1||i==n||i==a)?"* ":"  ");
            }
            System.out.println();
        }
    }
}