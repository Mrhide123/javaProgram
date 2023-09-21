import java.util.Scanner;
class SumNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for N: ");
        int N = scanner.nextInt();

        int S = 1;
        int Sum = N * (N + S) / 2;

        System.out.println("Result: " + Sum);

        // Don't forget to close the scanner when you're done with it.
        scanner.close();
    }
}
