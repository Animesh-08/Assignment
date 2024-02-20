 class CubeOfNumber {

    public static int productSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }

        int sum = 0;
        int currentProduct = 2 * 3;

        for (int i = 1; i <= n; i++) {
            sum += currentProduct;
            currentProduct = (currentProduct + 1) * (currentProduct + 2);
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = productSum(n);
        System.out.println("The sum of the product series up to " + n + " terms is: " + sum);
    }
}
