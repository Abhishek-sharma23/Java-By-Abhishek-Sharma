import java.util.*;
public class q9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) 
        {
            if (num > first) 
            {
                second = first;
                first = num;
            } 
            else if (num > second && num != first) 
            {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE) 
        {
            System.out.println("No second largest element.");
        } 
        else 
        {
            System.out.println("The second largest element is: " + second);
        }
    }
}