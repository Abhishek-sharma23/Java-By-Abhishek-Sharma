import java.util.*;
class q21
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter String - ");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for(char c='a';c<='z';c++)
        {
            System.out.println(sb.append(c).toString());
        }
    }
}