import java.util.*;

class Program25
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int a = 0;
        System.out.println("Enter the name:  ");
        a = sobj.nextInt();

        int Largest = 0;
        while(a != 0)
        {
            int digit = a % 10;
            if(digit > Largest)
            {
                Largest = digit;
            }
            a = a / 10;
        }

     System.out.println("Largest digit is: " + Largest);
    }
}2