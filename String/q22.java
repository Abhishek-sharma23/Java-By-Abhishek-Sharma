import java.util.*;
class q22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String - ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' '&&i<s.length()-1)
            {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        System.out.print(sb.toString());   
    }
}
