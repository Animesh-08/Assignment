public class HarmonicSeries {

    public static double harmonicSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        double sum = harmonicSum(n);
        System.out.println("The sum of the harmonic series up to " + n + " terms is: " + sum);
    }
}

