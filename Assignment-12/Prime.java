import java.util.Scanner;

class Number 
{
    int[] numbers;

    public Number(int n) {
        numbers = new int[n];
        input();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + numbers.length + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    public void display() {
        System.out.println("Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class OddNum extends Number {
    int[] oddNumbers;

    public OddNum(Number number) {
        super(number.numbers.length);
        countOddNumbers(number);
        copyOddNumbers(number);
    }

    private void countOddNumbers(Number number) {
        int count = 0;
        for (int num : number.numbers) {
            if (num % 2 != 0) {
                count++;
            }
        }
        oddNumbers = new int[count];
    }

    private void copyOddNumbers(Number number) {
        int index = 0;
        for (int num : number.numbers) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }
    }

    public void displayOddNumbers() {
        System.out.println("Odd Numbers:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class PrimeNum extends OddNum {
    int[] primeNumbers;

    public PrimeNum(OddNum oddNum) {
        super(oddNum);
        countPrimeNumbers(oddNum);
        copyPrimeNumbers(oddNum);
    }

    private void countPrimeNumbers(OddNum oddNum) {
        int count = 0;
        for (int num : oddNum.oddNumbers) {
            if (isPrime(num)) {
                count++;
            }
        }
        primeNumbers = new int[count];
    }

    private void copyPrimeNumbers(OddNum oddNum) {
        int index = 0;
        for (int num : oddNum.oddNumbers) {
            if (isPrime(num)) {
                primeNumbers[index++] = num;
            }
        }
    }

    public void displayPrimeNumbers() {
        System.out.println("Prime Numbers:");
        for (int num : primeNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Prime
{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        Number number = new Number(size);
        System.out.println();
        number.display();

        OddNum oddNum = new OddNum(number);
        System.out.println();
        oddNum.displayOddNumbers();

        PrimeNum primeNum = new PrimeNum(oddNum);
        System.out.println();
        primeNum.displayPrimeNumbers();
    }
}
