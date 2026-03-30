import java.util.*;

class Program18
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int a = 0;
        int Fact = 1;
        int i = 0;

        System.out.println("Enter the number: ");
        a = sobj.nextInt();

        for( i = 1; i<= a; i++)
        {
            Fact = Fact * i;

        }
        System.out.println("Factorial = "+Fact);
    }
}