import java.util.*;

class Program24
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int a = 0;
        System.out.println("Enter the number:  ");
        a = sobj.nextInt();

        int sumEven = 0; int sumOdd = 0;

        for(int i = 1; i <= a; i++)
        {
           if(i % 2 == 0)
           {
            sumEven = sumEven + i;
           } 
           else
           {
            sumOdd = sumOdd + i;
           }
        }
        System.out.println("Sum of Even numbers: " + sumEven);
        System.out.println("Sum of Odd numbers: " + sumOdd);
    }
}