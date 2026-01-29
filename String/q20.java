import java.util.*;
class q20
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String s[]={"Apple","Mango","Banana"};
        String l=s[0];
        for(int i=1;i<s.length;i++)
        {
            if(l.compareTo(s[i])<0)
            {
                l=s[i];
            }
        }
        System.out.print(l);
    }
}