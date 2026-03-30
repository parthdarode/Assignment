import java.util.*;

class Program17
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        int Rev = 0;
        int temp = 0;

        System.out.println("Enter the number: ");
        i = sobj.nextInt();
        
        temp = i; 

        while(i != 0)
        {
            int digit = i % 10;
            Rev = Rev * 10 + digit;
            i  = i / 10;

        }
        if(temp == Rev)
        {
        System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}