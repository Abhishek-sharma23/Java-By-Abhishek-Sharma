import java.util.*;
public class n11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j==1||i==1||(i==(n/2)+1&&j==(n/2)+1)||(i==(n/2)+1&&j==n/2)?"* ":"  ");
            }
            System.out.println();
        }
    }
}