class SumPrime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void findPrimeNumbers(int m, int n) {
        for (int num = m; num <= n; num++) {
            if (isPrime(num) && isPrime(sumOfDigits(num))) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        int m = 10;
        int n = 100;
        System.out.println("Prime numbers from " + m + " to " + n + " with prime digit sum:");
        findPrimeNumbers(m, n);
    }
}
