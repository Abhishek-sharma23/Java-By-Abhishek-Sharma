import java.util.*;
class q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int marks[]=new int[n];
        for(int j=0;j<n;j++)
        {
            marks[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(marks[i]);
        }
    }
}