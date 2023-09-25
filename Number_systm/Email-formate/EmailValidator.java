public class EmailValidator {
    public static void main(String[] args) {
        String email = "example@email.com"; // Replace with the email you want to validate

        if (isValidEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}
