import java.util.*;
public class q3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        Set<Character> seen=new HashSet<>();
        int a=0,b=0,c=0;
        while(c<n.length())
        {
            if(!seen.contains(n.charAt(c))) //Input - abhiabhi
            {                               //output - 4
                seen.add(n.charAt(c));
                c++;
                a=Math.max(a,c-b);
            }
            else
            {
                seen.remove(n.charAt(b));
                b++;
            }
        }
        System.out.print(a);
    }
}