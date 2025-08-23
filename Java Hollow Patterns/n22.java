import java.util.*;
public class n22
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i==1||i==n||j==1||j==n?"- ":"| ");
            }
            System.out.println();
        }
    }
}