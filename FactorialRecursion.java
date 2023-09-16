import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method to calculate the factorial
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        
        // Read the input from the user
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate and print the factorial
            int factorial = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
        scanner.close();
    }
}
