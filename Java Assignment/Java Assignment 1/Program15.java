import java.util.*;

class Program15
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        int Rev = 0;

        System.out.println("Enter the number: ");
        i = sobj.nextInt();

        while(i != 0)
        {
            int digit = i % 10;
            Rev = Rev * 10 + digit;
            i  = i / 10;

        }
        System.out.println("Reverse = "+Rev);
    }
}