class Fraction 
{
    private int num;
    private int denom;

    // Default constructor
    public Fraction() {
        num = 0;
        denom = 1;
    }

    // One argument constructor
    public Fraction(int num) {
        this.num = num;
        denom = 1;
    }

    // Two argument constructor
    public Fraction(int num, int denom) {
        this.num = num;
        if (denom != 0) {
            this.denom = denom;
        } else {
            System.out.println("Error: Denominator cannot be zero. Setting denominator to 1.");
            this.denom = 1;
        }
    }

    // Copy constructor
    public Fraction(Fraction other) {
        this.num = other.num;
        this.denom = other.denom;
    }

    // Method to display fraction
    public void show() {
        System.out.println(num + "/" + denom);
    }

    // Method to add fractions
    public Fraction add(Fraction other) {
        int newNum = this.num * other.denom + other.num * this.denom;
        int newDenom = this.denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    // Method to subtract fractions
    public Fraction subtract(Fraction other) {
        int newNum = this.num * other.denom - other.num * this.denom;
        int newDenom = this.denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    // Method to multiply fractions
    public Fraction multiply(Fraction other) {
        int newNum = this.num * other.num;
        int newDenom = this.denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    // Method to divide fractions
    public Fraction divide(Fraction other) {
        if (other.num == 0) {
            System.out.println("Error: Division by zero. Returning 0/1");
            return new Fraction();
        }
        int newNum = this.num * other.denom;
        int newDenom = this.denom * other.num;
        return new Fraction(newNum, newDenom);
    }

    // Method to compare fractions
    public int compare(Fraction other) {
        double fraction1 = (double) this.num / this.denom;
        double fraction2 = (double) other.num / other.denom;
        return Double.compare(fraction1, fraction2);
    }

    // Method to convert fraction to mixed fraction
    public void mixed() {
        int whole = num / denom;
        int remainder = num % denom;
        System.out.println(whole + " " + Math.abs(remainder) + "/" + denom);
    }

    // Method to reduce fraction
    public void reduce() {
        int gcd = gcd(num, denom);
        num /= gcd;
        denom /= gcd;
    }

    // Method to find greatest common divisor
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

public class ass8_1 {
    public static void main(String[] args) {
        // Testing the Fraction class
        Fraction fraction1 = new Fraction(13, 4);
        Fraction fraction2 = new Fraction(12, 5);

        // Addition
        Fraction result = fraction1.add(fraction2);
        result.reduce();
        System.out.print("Addition: ");
        result.show();

        // Subtraction
        result = fraction1.subtract(fraction2);
        result.reduce();
        System.out.print("Subtraction: ");
        result.show();

        // Multiplication
        result = fraction1.multiply(fraction2);
        result.reduce();
        System.out.print("Multiplication: ");
        result.show();

        // Division
        result = fraction1.divide(fraction2);
        result.reduce();
        System.out.print("Division: ");
        result.show();

        // Comparison
        System.out.println("Comparison: " + fraction1.compare(fraction2));

        // Mixed fraction
        System.out.print("Mixed fraction for fraction1: ");
        fraction1.mixed();
    }
}
