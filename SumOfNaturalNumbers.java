import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = 0;

            // Calculate the sum of natural numbers up to n
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
        }

        input.close();
    }
}
