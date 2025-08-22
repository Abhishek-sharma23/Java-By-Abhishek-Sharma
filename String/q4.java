import java.util.*;
public class q4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int a=0;
        int b=n.length()-1;
        while(a<b)
        {
            if(n.charAt(a)!=n.charAt(b))        //Palindrome
            {
                System.out.print("False");
                return;
            }
            a++;
            b--;
        }
        System.out.print("True");
    }
}