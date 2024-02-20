import java.util.Scanner;
class Triangle_Q4 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter values of three sides of Triangle: ");
System.out.println("Enter value of first side ");
int s1 = sc.nextInt();
System.out.println("Enter value of second side ");
int s2 = sc.nextInt();
System.out.println("Enter value of third side ");
int s3 = sc.nextInt();

if(s1==s2 && s2==s3)
{
System.out.println("Given triangle is equilateral");
}
else if(s1==s2 || s2==s3 || s3==s1)
{
System.out.println("given triangle is isoceles");
}
else
{
System.out.println("given triangle is scalene");
}
}
}
