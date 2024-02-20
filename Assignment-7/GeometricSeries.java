 class GeometricSeries {

    public static double geometricSeriesSum(double x, int n) {
        if (Math.abs(x) >= 1 || n <= 0) {
            throw new IllegalArgumentException("Invalid input: |x| < 1 and n > 0");
        }

        double sum = 1.0;
        double power = 1.0 / x; // Initialize power term

        for (int i = 1; i <= n; i++) {
            sum += power;
            power *= 1.0 / x; // Update power term for next iteration
        }

        return sum;
    }

    public static void main(String[] args) {
        double x = 0.5;
        int n = 5;
        double sum = geometricSeriesSum(x, n);
        System.out.println("The sum of the geometric series is: " + sum);
    }
}

