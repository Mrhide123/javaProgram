import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        // Perform bitwise AND
        int resultAnd = a & b;
        System.out.println("a & b = " + resultAnd);

        // Perform bitwise OR
        int resultOr = a | b;
        System.out.println("a | b = " + resultOr);

        // Perform bitwise XOR
        int resultXor = a ^ b;
        System.out.println("a ^ b = " + resultXor);

        // Perform bitwise NOT for 'a'
        int resultNotA = ~a;
        System.out.println("~a = " + resultNotA);

        // Shorthand assignment with bitwise AND
        a &= b;
        System.out.println("a &= b => a = " + a);

        scanner.close();
    }
}
