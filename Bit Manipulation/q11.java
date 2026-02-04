import java.util.*;
class q11
{
    public static void main(String[] args)      //Update ith Bit
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter bit position (i): ");
        int i = sc.nextInt();
        System.out.print("Enter new bit value (0 or 1): ");
        int newBit = sc.nextInt();
        int bitMask = 1 << i;
        if (newBit == 0) 
        {
            n=n&(~bitMask);
        } 
        else 
        {
            n=n|bitMask;
        }
        System.out.println("Updated number: " + n);
    }
}
