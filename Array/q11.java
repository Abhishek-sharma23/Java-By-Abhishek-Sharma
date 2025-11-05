import java.util.*;
class q11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Arrays after sorting - ");
        Arrays.sort(arr);
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}