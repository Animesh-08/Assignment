import java.util.Scanner;

public class Reduce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int singleDigit = reduceToSingleDigit(number);

        System.out.println("The single-digit reduction of " + number + " is " + singleDigit);
    }

    public static int reduceToSingleDigit(int number) {
        while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}
