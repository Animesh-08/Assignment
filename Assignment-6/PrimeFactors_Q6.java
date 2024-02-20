import java.util.Scanner;

public class PrimeFactors_Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Prime factors of " + number + ": ");
        findPrimeFactors(number);

        scanner.close();
    }

    // Function to find and print all prime factors of a number
    private static void findPrimeFactors(int num) {
        // Print the number 2 if it is a factor
        while (num % 2 == 0) {
            System.out.print("2 ");
            num /= 2;
        }

        // Check for odd prime factors starting from 3
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        // If the remaining number is a prime greater than 2
        if (num > 2) {
            System.out.print(num);
        }
    }
}