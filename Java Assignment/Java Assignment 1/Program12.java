import java.util.*;

class Program12
{
    public static void main(String Arg[])
    {
        Scanner Sobj = new Scanner(System.in);

        int a = 0;
        int i = 0;

        System.out.println("Enter the number: ");
        a = Sobj.nextInt();
        
        i = 1;
        while(i <= a)
        {
            System.out.println(i);
            i++;
        }
    }
}