import java.util.*;
public class q5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        Set<Character> seen=new HashSet<>();
        StringBuilder r=new StringBuilder();
        for(char c:n.toCharArray())         //Remove Duplicate String.
        {                                   //Input - Abhishek
            if(seen.add(c))                 //output - Abhisek
            {
                r.append(c);
            }
        }
        System.out.print(r.toString());
    }
}
