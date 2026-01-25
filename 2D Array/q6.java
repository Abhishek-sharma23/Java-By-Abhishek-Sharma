import java.util.*;
class q6
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
        System.out.print("Enter Key - ");
        int key=sc.nextInt();
        int a=0;
        int row=0, col=arr[0].length-1;
        while(row<arr.length && col>=0)
        {
            if(arr[row][col]==key)
            {
                System.out.println("Key found at ("+row+","+col+")");
                a++;
                break;
            }
            else if(key<arr[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        if(a==0)
        {
            System.out.print("Key Not Found.");
        }
    }
}