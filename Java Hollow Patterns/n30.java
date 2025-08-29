import java.util.*;
class n30
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n*2;i++)
        {
            System.out.println((i==1||i==n)?" ".repeat(n*2-i)+"* ".repeat(i):(i<n*2-1)?" ".repeat(n*2-i)+"* "+"  ".repeat(i-2)+"* ":" ");
        }
    }
}