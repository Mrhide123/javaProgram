package Number_systm.GCD;

class GcdCalculator {

    public static void main(String[] args) {
        int m = 2, n = 3;
        int gcd = 1;
        for (int i = 1; i <= m && i <= n; ++i) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + m + " and " + n + " is " + gcd);
    }
}
