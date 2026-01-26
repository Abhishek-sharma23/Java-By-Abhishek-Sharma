import java.util.*;
class q9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Path - ");
        String Path=sc.nextLine();
        int x=0,y=0;
        for(int i=0;i<Path.length();i++)
        {
            char dir=Path.charAt(i);
            if(dir=='S')
            {
                x++;
            }
            else if(dir=='E')
            {
                y++;
            }
            else if(dir=='W')
            {
                y--;
            }
            else if(dir=='N')
            {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        System.out.println(Math.sqrt(x2+y2));
    }
}