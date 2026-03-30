import java.util.*;
class Program8
{
    public static void main(String Arg[])
    {
    int Year = 0;
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the year: ");
    Year = sobj.nextInt();

    if(Year % 4 == 0)
    {
        System.out.println("Leap Year");
    }
    else
    {
        System.out.println("Not a Leap Year");
    }
    }

}