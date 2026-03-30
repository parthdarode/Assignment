import java.util.*;

class Program4
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        {
            char ch = '\u0000';
            System.out.println("Enter the character: ");
            ch = sobj.next().charAt(0);

            int ascii = ch;

            System.out.println("ASCII Value of: " + ascii);
            
        }

    }
}