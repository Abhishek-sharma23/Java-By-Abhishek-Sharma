import java.util.*;
class n20
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n*2)-1;j++)
            {
                System.out.print(i+n-1==j||i+j==n+1?"* ":"  ");
            }
            System.out.println();
        }
         for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=(n*2)-1;j++)
            {
                System.out.print(i+1==j||i+j==n+n-1?"* ":"  ");
            }
            System.out.println();
        }
    }
}