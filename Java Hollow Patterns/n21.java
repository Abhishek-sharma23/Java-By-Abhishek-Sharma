import java.util.*;
public class n21
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((j==1&&i==1||j==n&&i==n||j==n&&i==1||i==n&&j==1||i==n/2+1&&j==n/2+1)?"  ":"* ");
            }
            System.out.println();
        }
    }
}