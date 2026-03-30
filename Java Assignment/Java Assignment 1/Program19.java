import java.util.*;

class Program18
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int n;

        System.out.print("Enter N: ");
        n = sobj.nextInt();

        int a = 0, b = 1;

        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}