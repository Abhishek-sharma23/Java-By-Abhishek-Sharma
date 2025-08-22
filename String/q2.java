import java.util.*;
public class q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String n1=sc.nextLine();
        char[] arr1=n.toCharArray();        //input - abhi abhi
        char[] arr2=n1.toCharArray();       //output - true.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.print(Arrays.equals(arr1, arr2));
    }
}