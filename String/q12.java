import java.util.*;
public class q12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                   //First Max
        int[] arr = new int[n];                 //Second Max
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int f = arr[0];
        int s = arr[0];
        for (int i = 1; i < n; i++) 
        {
            if (arr[i] > f) 
            {
                s = f;
                f = arr[i];
            } 
            else if (arr[i] > s && arr[i] != f) 
            {
                s = arr[i];
            }
        }  
            System.out.println("First Maximum: " + f);
            System.out.println("Second Maximum: " + s);
    }
}
