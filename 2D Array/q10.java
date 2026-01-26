import java.util.*;
class q10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter Array Elements - ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array Elements Are - ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern - ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(((i==0)||(j==0)||(j==2)||(i==2))?arr[i][j]+" ":"  ");
            }
            System.out.println();
        }
    }
}