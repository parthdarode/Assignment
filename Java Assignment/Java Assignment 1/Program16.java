import java.util.*;

class Program16
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        int Count = 0;

        System.out.println("Enter the number: ");
        i = sobj.nextInt();

        while(i != 0)
        {
            i = i / 10;
            Count++;

        }
        System.out.println("Count: "+ Count);
    }
}