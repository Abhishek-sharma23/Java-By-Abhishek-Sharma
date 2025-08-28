import java.util.*;
class q15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i+j==n+1?(c++)+" ":"  ");
            }
            System.out.println();
        }
    }
}