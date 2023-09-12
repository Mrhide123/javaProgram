import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        int decimalValue = binaryToDecimal(binaryString);

        if (decimalValue != -1) {
            System.out.println("Decimal equivalent: " + decimalValue);
        } else {
            System.out.println("Invalid binary input. Please enter a valid binary number.");
        }

        scanner.close();
    }

    public static int binaryToDecimal(String binaryString) {
        int decimalValue = 0;
        int binaryBase = 1; // Represents 2^0

        // Iterate through the binary string from right to left
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digit = binaryString.charAt(i);

            // Check if the digit is a valid binary digit (0 or 1)
            if (digit == '0' || digit == '1') {
                // Convert the character '0' or '1' to its numeric value (0 or 1)
                // Multiply it by the appropriate power of 2 and add to the result
                decimalValue += (digit - '0') * binaryBase;

                // Increase the binaryBase for the next position (2^1, 2^2, ...)
                binaryBase *= 2;
            } else {
                return -1; // Invalid binary input
            }
        }

        return decimalValue;
    }
}
