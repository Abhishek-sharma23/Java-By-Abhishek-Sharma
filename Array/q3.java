import java.util.*;
class q3
{
    static void min(int arr[])
    {
        int minimum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(minimum>arr[i])
            {
                minimum=arr[i];
            }
        }
            System.out.print(minimum);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        System.out.println(Arrays.toString(arr));
        min(arr);
    }
}