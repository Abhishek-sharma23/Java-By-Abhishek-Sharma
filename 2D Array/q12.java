import java.util.*;
class q12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements - ");
        int arr[][]=new int[3][3];
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
        int a=0;
        for(int i=0;i<arr[0].length;i++)
        {
            a=a+arr[1][i];
        }
        System.out.print("Sum of 2nd row is - "+a);
    }
}