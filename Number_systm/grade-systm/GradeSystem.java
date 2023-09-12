import java.util.Scanner;

public class GradeSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");

        double marks = sc.nextDouble();

        if (marks >= 0 && marks <= 100) {
            if (marks >= 40) {
                System.out.println("Student has passed");
            } else {
                System.out.println("Student has failed");
            }
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
