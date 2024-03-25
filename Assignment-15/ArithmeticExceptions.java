import java.util.Scanner;

class ArithmeticExceptions {
    public static void main(String ar[]) {
        try {
            int numerator, denominator;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st number:");
            numerator = s.nextInt();
            System.out.println("Enter 2nd number:");
            denominator = s.nextInt();
            System.out.println("Division:" + (numerator / denominator));
        } catch (Exception e) {
            System.out.println("AIRTHMETIC EXCEPTION!" + e);
        }
    }
}