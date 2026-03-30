import java.util.*;

class Program11
{
    public static void main(String Arg[])
    {
        Scanner Sobj = new Scanner(System.in);

        int a = 0;
        int i = 0;

        System.out.println("Enter the number: ");
        a = Sobj.nextInt();
        
        for(i = 1; i <= a; i++)
        {
            System.out.println(i);
        }
    }
}