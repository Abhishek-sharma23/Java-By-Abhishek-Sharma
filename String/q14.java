import java.util.*;
class q14
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
                System.out.print(i==j?(c++)+" ":"  ");
            }
            System.out.println();
        }
    }
}