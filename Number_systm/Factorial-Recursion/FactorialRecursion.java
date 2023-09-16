import java.util.Scanner;

public class FactorialRecursion {
    // method to find factorial of given number
    static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    // Driver method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the input is non-negative
        if (num < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is " + factorial(num));
        }

        // Close the scanner
        scanner.close();
    }
}
