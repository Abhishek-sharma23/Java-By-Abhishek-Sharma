import java.util.*;
class q7
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
        int fmax=0, smax=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>fmax)
            {
                smax=fmax;
                fmax=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=fmax)
            {
                smax=arr[i];
            }
        }
        System.out.println("First Max - "+fmax);
        System.out.println("Second Max - "+smax);
    }
}