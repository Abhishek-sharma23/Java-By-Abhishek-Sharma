import java.util.*;
class q1
{
    public static void main(String[] args)      // Without using loops.
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter The String - ");
        String n=sc.nextLine();
        StringBuilder a=new StringBuilder(n);
        String b=a.reverse().toString();
        if(b.equals(n))
        {
            System.out.print("Its A Palindrom.");
        }
        else
        {
            System.out.print("Its Not A Palindrome.");
        }
    }
}