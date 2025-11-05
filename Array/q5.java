import java.util.*;
class q5
{
    static void std(int marks[])
    {
        System.out.println("Your marks is as follows - ");
        for(int i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.print("Total is - ");
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+marks[i];
        }
        System.out.println(sum);
        System.out.println("Percentage "+sum/5);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
        for(int i=0;i<5;i++)
        {                               
            marks[i]=sc.nextInt();
        }
        std(marks);
    }
}