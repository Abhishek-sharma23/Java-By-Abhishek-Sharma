import java.util.*;
public class Q10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n*2)-1;j++)
            {
                System.out.print((j==1||j==(n*2)-1||i==n||i==j||i+j==n+5)?"* ":"  ");
            }
            System.out.println();
        }
    }
} 