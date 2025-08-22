import java.util.*;
public class q11 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();               //Sum of all array elements
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) 
        {
            sum += arr[i];
        }
        arr[size-1] = sum;
        System.out.print(arr[size-1]);
    }
}
