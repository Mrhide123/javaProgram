import java.util.Random;
import java.util.Scanner;

public class GenerateRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the minimum number: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum number: ");
        int max = scanner.nextInt();

        if (min >= max) {
            System.out.println("Invalid range. Max must be greater than min.");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(max - min + 1) + min;
            System.out.println("Random number between " + min + " and " + max + ": " + randomInt);
        }

        scanner.close();
    }
}
