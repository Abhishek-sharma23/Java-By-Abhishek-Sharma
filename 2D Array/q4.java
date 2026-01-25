import java.util.*;
class q4
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
        System.out.println("Sum Of Digomals Are - ");
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i][i];
            if(i!=arr.length-1-i)
            {
                sum+=arr[i][arr.length-i-1];
            }
        }
        System.out.print(sum);
    }
}