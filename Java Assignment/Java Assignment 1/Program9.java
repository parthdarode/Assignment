import java.util.*;

class Program9
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        char ch = '\u0000';

        System.out.println("Enter the first number");
        a = sobj.nextInt();

        System.out.println("Enter the Second number");
        b = sobj.nextInt();

        System.out.println("Enter the operator");
        ch = sobj.next().charAt(0);

       
       switch(ch)
       {
        case '+':
                System.out.println(a + b);
                break;

        case '-':
                System.out.println(a - b);
                break;


        case '*':
                System.out.println(a * b);
                break;


        case '/':
                System.out.println(a / b);
                break;

        default:
                System.out.println("invalid");
                                    
       }


    }
}