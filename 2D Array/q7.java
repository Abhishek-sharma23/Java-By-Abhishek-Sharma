import java.util.*;
class q7
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
        System.out.println("Primary Diagonal - ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println(arr[i][i]);
        }
        System.out.print("Ther sum is - ");
        int primarySum=0, secondarySum=0;
        for(int i=0;i<3;i++)
        {
            primarySum+=arr[i][i];
            secondarySum+=arr[i][3-i-1];
        }
        System.out.println(primarySum);
        System.out.println("Secondary Diagonal - ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println(arr[i][3-i-1]);
        }
        System.out.print("Ther sum is - ");
        System.out.println(secondarySum);
        System.out.println("Total Sum Of Matrix - ");
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum+=arr[i][j];
            }
        }
        System.out.print(sum);
    }
}