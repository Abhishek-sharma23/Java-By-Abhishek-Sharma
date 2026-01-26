import java.util.*;
class q8
{
    public static void main(String[] args)      // With using for loop.
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter String - ");
        String n=sc.nextLine();
        boolean a=true;
        for(int i=0;i<n.length()/2;i++)
        {
            if(n.charAt(i)!=n.charAt(n.length()-i-1))
            {
                a=false;
                break;
            }
        }
        if(a==false)
        {
            System.out.print("Its Not A Palindrom.");
        }
        else
        {
            System.out.print("Its A Palindrom.");
        }
    }
}