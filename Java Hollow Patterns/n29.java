import java.util.*;
class n29
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(" ".repeat(n-i));
            for(int j=1;j<=n;j++)
            {
                System.out.print((i==n||i==j||j==1)?"* ":"  ");
            }
            System.out.println();
        }
    }
}