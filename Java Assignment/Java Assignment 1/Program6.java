import java.util.*;

class Program6
{
    public static void main(String Arg[])
    {
        int No = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:  ");
        No = sobj.nextInt();

        if(No > 0)
        {
            System.out.println("Positive");
        }
        else if(No < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
        
    }
}