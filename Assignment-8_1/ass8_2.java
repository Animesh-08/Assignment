class Complex 
{
    private int real;
    private int img;

    // Default constructor
    public Complex() {
        real = 0;
        img = 0;
    }

    // Parameterized constructor
    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    // Copy constructor
    public Complex(Complex other) {
        this.real = other.real;
        this.img = other.img;
    }

    // Method to display complex number
    public void showComplex() {
        System.out.println(real + " + " + img + "i");
    }

    // Method to add two complex numbers
    public Complex addComplex(Complex other) {
        Complex sum = new Complex();
        sum.real = this.real + other.real;
        sum.img = this.img + other.img;
        return sum;
    }

    // Method to subtract two complex numbers
    public Complex subtractComplex(Complex other) {
        Complex diff = new Complex();
        diff.real = this.real - other.real;
        diff.img = this.img - other.img;
        return diff;
    }

    // Method to multiply two complex numbers
    public Complex multiplyComplex(Complex other) {
        Complex product = new Complex();
        product.real = this.real * other.real - this.img * other.img;
        product.img = this.real * other.img + this.img * other.real;
        return product;
    }
}

public class ass8_2 {
    public static void main(String[] args) {
        // Create complex numbers
        Complex num1 = new Complex(3, 4);
        Complex num2 = new Complex(2, 5);

        // Display complex numbers
        System.out.print("Complex number 1: ");
        num1.showComplex();
        System.out.print("Complex number 2: ");
        num2.showComplex();

        // Addition
        Complex sum = num1.addComplex(num2);
        System.out.print("Addition: ");
        sum.showComplex();

        // Subtraction
        Complex diff = num1.subtractComplex(num2);
        System.out.print("Subtraction: ");
        diff.showComplex();

        // Multiplication
        Complex product = num1.multiplyComplex(num2);
        System.out.print("Multiplication: ");
        product.showComplex();
    }
}
