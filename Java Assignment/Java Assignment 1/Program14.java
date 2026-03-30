import java.util.*;

class Program14
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = 0;
        int i = 0;
     

        System.out.println("Enter the number: ");
        n = sobj.nextInt();

        for(i = 1; i <= 10; i++)
        {
            
            System.out.println(n * i);
            
        }
      
    }
}