import java.util.*;

class Program3
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int a = 0;
        double d = 0.0;

        System.out.println("Enter the 1st number : ");
        a = sobj.nextInt();

        System.out.println("Enter the 2nd number : ");
        d = sobj.nextDouble();

        double d1 = a;
        int i1 = (int) d;


        System.out.println("impicit conversion: " +d1);
        System.out.println("Expicit conversion: "+i1);

    }
}