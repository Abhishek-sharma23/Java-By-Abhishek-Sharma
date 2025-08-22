import java.util.*;
public class n1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
            System.out.print(i==n||i+j==n+1||i==j||i==1?"* ":"  ");
            }
            System.out.println();
        }
    }
}