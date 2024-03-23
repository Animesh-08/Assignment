import java.util.Scanner;

interface IntOperations 
{
    boolean isPositive(int num);
    boolean isNegative(int num);
    boolean isEven(int num);
    boolean isOdd(int num);
    boolean isPrime(int num);
    boolean isPalindrome(int num);
    int factorial(int num);
    int sumOfDigits(int num);
}

class MyNumber implements IntOperations {
    private int number;

    // Default constructor
    MyNumber() {
        this.number = 0;
    }

    // Parameterized constructor
    MyNumber(int number) {
        this.number = number;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }


    public boolean isNegative(int num) {
        return num < 0;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

 
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }


    public boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

   
    public boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

  
    public int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

 
    public int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

public class Operations 
{
    public static void main(String[] args)
 {

        Scanner sc = new Scanner(System.in);
        MyNumber myNumber = new MyNumber();
        System.out.println("enter a number to check");
        int num = sc.nextInt(); // Example number

        System.out.println("Number Properties Menu:");
        System.out.println("1. Check if the number is positive");
        System.out.println("2. Check if the number is negative");
        System.out.println("3. Check if the number is even");
        System.out.println("4. Check if the number is odd");
        System.out.println("5. Check if the number is prime");
        System.out.println("6. Check if the number is a palindrome");
        System.out.println("7. Calculate factorial of the number");
        System.out.println("8. Calculate sum of digits of the number");
        System.out.println("Enter your choice:");

    
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Is the number positive? " + myNumber.isPositive(num));
                break;
            case 2:
                System.out.println("Is the number negative? " + myNumber.isNegative(num));
                break;
            case 3:
                System.out.println("Is the number even? " + myNumber.isEven(num));
                break;
            case 4:
                System.out.println("Is the number odd? " + myNumber.isOdd(num));
                break;
            case 5:
                System.out.println("Is the number prime? " + myNumber.isPrime(num));
                break;
            case 6:
                System.out.println("Is the number palindrome? " + myNumber.isPalindrome(num));
                break;
            case 7:
                System.out.println("Factorial of the number: " + myNumber.factorial(num));
                break;
            case 8:
                System.out.println("Sum of digits of the number: " + myNumber.sumOfDigits(num));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
