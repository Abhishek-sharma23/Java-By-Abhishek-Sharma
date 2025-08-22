import java.util.*;
public class q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(n-i)+1;k++)
            {
                System.out.print((n-i)+1+" ");
            }
            System.out.println();
        }
    }
}