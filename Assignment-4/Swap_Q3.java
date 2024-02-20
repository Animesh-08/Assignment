class Swap_Q3
{
public static void main(String args[])
{
int num1 = Integer.parseInt(args[0]);
int num2 = Integer.parseInt(args[1]);

num1 = num1 ^ num2;
num2 = num1 ^ num2;
num1 = num1 ^ num2;

System.out.println("The swapped values are: ");
System.out.println(num1);
System.out.println(num2);

num1 = num1 + num2;
num2 = num1 - num2;
num1 = num1 - num2;

System.out.println("The restored values are: ");
System.out.println(num1);
System.out.println(num2);

}
}