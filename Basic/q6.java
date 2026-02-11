import java.util.*;
class q6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Percentage To Find Grade - ");
        int n=sc.nextInt();
        if(n>90 && n<=100)
        {
            System.out.print("Grade - O ");
        }
        else if(n>80 && n<=90)
        {
            System.out.print("Grade - A+");
        }
        else if(n>70 && n<=80)
        {
            System.out.print("Grade - A");
        }
        else
        {
            System.out.print("Grade - F");
        }
    }
}