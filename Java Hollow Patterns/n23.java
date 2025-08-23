import java.util.*;
public class n23
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j==1||i+j==n-1||i==j+2?"* ":"  ");
            }
            System.out.println();
        }
    }
}