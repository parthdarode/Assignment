import java.util.*;
class Program10
{
    public static void main(String arg[])
   {
    Scanner sobj = new Scanner(System.in);
    char ch ='\u0000'; 

    System.out.println("Enter the character:  ");
    ch = sobj.next().charAt(0);

    if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'|| 
    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
    {
        System.out.println("Vowels");
    }
    else
    {
        System.out.println("Consonant");
    }

   } 
}