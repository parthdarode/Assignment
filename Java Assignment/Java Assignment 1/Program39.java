import java.util.Scanner;

class GuessGame
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 100) + 1; // random number 1-100
        int guess = 0;

        System.out.println("Guess the number (1-100):");

        while(guess != number) 
        {
            guess = sc.nextInt();
            if(guess < number) System.out.println("Too low!");
            else if(guess > number) System.out.println("Too high!");
            else System.out.println("You guessed it!");
        }
    }
}