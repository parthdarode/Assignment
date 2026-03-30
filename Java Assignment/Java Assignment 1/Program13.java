import java.util.*;

class Program13
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int a = 0;
        int i = 0;
        int iSum = 0;

        System.out.println("Enter the number: ");
        a = sobj.nextInt();


     for(i = 1; i <= a; i++)
     {
        iSum = iSum + i;
     }
     System.out.println("Sum is: "+ iSum);
        
    }
}