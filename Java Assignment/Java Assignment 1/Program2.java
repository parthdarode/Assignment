import java.util.*;

class Program2
{
    public static void main(String Arg[])
    {
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the first number : ");
         int a = sobj.nextInt();
          System.out.println("Enter the Second number : ");
         double b = sobj.nextDouble();

         double add = a + b;
         double div = a / b;
         int castResult = (int)div;

          System.out.println("Addition is : "+add);
          System.out.println("Division is  : "+div);
          System.out.println("Typecast to int: " + castResult);

         sobj.close();
    }
}