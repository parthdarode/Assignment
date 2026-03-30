import java.util.*;

class Program7
{
    public static void main(String Arg[])
    {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1st Number :  ");
        a = sobj.nextInt();
        System.out.println("Enter 1st Number :  ");
        b = sobj.nextInt();
        System.out.println("Enter 1st Number :  ");
        c = sobj.nextInt();

        if(a >= b && a > c)
        {
            System.out.println("Largest is: "+a);
        }
        else if(b >= a && b >= c)
        {
            System.out.println("Largest number is: "+b);
        }
        else
        {
            System.out.println("Largest is: "  +c);
        }

    }
}