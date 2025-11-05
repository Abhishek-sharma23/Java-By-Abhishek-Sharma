import java.util.*;
class q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<num.length;i++)
        {
             if(num[i]==x)
             {
                System.out.print(i);
             }
        }
    }
}