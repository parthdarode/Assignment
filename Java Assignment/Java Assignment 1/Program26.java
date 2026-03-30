import java.util.Scanner;

class Program26
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Swap with third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap with temp: a=" + a + ", b=" + b);

        // Swap without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap without temp: a=" + a + ", b=" + b);
    }
}