import java.util.*;

class Program5
{
    public static void main(String Arg[])
    {
      Scanner sobj = new Scanner(System.in);
      char ch = sobj.next().charAt(0);

      char next = (char) (ch + 1);
      char prev =  (char) (ch - 1);


        System.out.println("Previous character is: "+prev);
        System.out.println("next character is: "+next);
    

    }
}