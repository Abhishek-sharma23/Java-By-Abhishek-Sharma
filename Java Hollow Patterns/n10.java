import java.util.*;
public class n10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Numbers -- ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j==2||j==n-1||i==2||i==n-1||(i==(n/2)+1&&j==(n/2)+1)?"* ":"  ");
            }
            System.out.println();
        }
    }
}
