import java.util.*;
class q14
{
    public static void main(String[] args)    //Check If The Number Is Power Of 2 Or Not.
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print((n&(n-1))==0);
    }
}