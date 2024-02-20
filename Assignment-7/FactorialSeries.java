public class FactorialSeries {

    public static double factorialSeriesSum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        double sum = 1.0;
        double factorial = 1.0; // Initialize factorial with 1!

        for (int i = 1; i <= n; i++) {
            factorial *= i; // Calculate i!
            sum += 1.0 / factorial; // Add 1 / i! to the sum
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        double sum = factorialSeriesSum(n);
        System.out.println("The sum of the factorial series up to " + n + " terms is: " + sum);
    }
}
