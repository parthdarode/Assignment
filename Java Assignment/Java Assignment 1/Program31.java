import java.util.Scanner;

class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cont = 'y';

        while(cont == 'y' || cont == 'Y') {
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            for(int i = 1; i <= 10; i++)
                System.out.println(n + " x " + i + " = " + (n * i));

            System.out.print("Continue? (y/n): ");
            cont = sc.next().charAt(0);
        }

        System.out.println("Program stopped");
    }
}