import java.util.*;

class Program23
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sobj.nextInt();
        boolean prime = true;

        if(n <= 1)
        {
            prime = false;
        }
        else
        {
            for(int i = 2; i <= n/2; i++)
            {
                if(n % i == 0)
                {
                    prime = false;
                    break;
                }
            }
        }

        if(prime)
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");
    }
}