import java.util.*;
public class q13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++)          //Find the missing Number.
        {
            arr[i] = sc.nextInt();
            c += arr[i];
        }
        int N = n + 1;
        int a = (N * (N + 1)) / 2;
        System.out.println("Missing Number: " + (a-c));
    }
}