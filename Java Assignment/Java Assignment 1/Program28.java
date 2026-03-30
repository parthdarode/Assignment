import java.util.Scanner;

class Program28 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter marks of 5 subjects:");
        for(int i = 1; i <= 5; i++) 
        {
            System.out.print("Subject " + i + ": ");
            total += sc.nextInt();
        }

        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if(percentage >= 80)
            System.out.println("Grade: A");
        else if(percentage >= 60)
            System.out.println("Grade: B");
        else if(percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}