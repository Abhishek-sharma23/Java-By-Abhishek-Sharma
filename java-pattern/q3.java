import java.util.*;
public class q3
{
    public static void main(String[] args)
    {
        char c=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print((j==1||i==5)?(c++):(" "));
            }
            System.out.println();
        }
    }
}