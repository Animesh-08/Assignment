import java.util.Scanner;
public class Arithmetic
{

public static int add(int num1,int num2)
{
int sum =0;
sum = num1+num2;
return sum;
}

public static float add(float num1,float num2)
{
float sum =0;
sum = num1+num2;
return sum;
}
public static double add(double num1,double num2)
{
double sum =0;
sum = num1+num2;
return sum;
}
public static double add(double num1,float num2)
{
double sum =0;
sum = num1+num2;
return sum;
}
public static double add(double num1,int num2)
{
double sum =0;
sum = num1+num2;
return sum;
}
public static int subtract(int num1,int num2)
{
int sub =0;
sub = num1-num2;
return sub;
}
public static float subtract(float num1,float num2)
{
float sub =0;
sub = num1-num2;
return sub;
}
public static Double subtract(Double num1,Double num2)
{
Double sub =0.0;
sub = num1-num2;
return sub;
}
public static Double subtract(Double num1,float num2)
{
Double sub =0.0;
sub = num1-num2;
return sub;
}
public static double subtract(double num1,int num2)
{
Double sub =0.0;
sub = num1-num2;
return sub;
}
public static int division(int num1,int num2)
{
int div =0;
div = num1/num2;
return div;
}
public static float division(float num1,float num2)
{
float div =0;
div = num1/num2;
return div;
}
public static double division(double num1,double num2)
{
double div =0;
div = num1/num2;
return div;
}

public static double division(double num1,int num2)
{
double div =0;
div = num1/num2;
return div;
}

public static boolean isPrime(int n){
for(int i=2;i<n;i++)
{
if(n % i == 0)
{
return false;
}
}
return true;
}

public static int findFactorial(int n){
int fact = 1;
for(int i =2;i<=n;i++)
{
fact = fact *i;
}
return fact;
}

public static boolean isPalindrome(int n)
{
int temp = n;
int rev =0;
while(n!=0)
{
rev = (rev*10+(n%10));
n = n/10;
}
if(temp == rev)
return true;
else 
return false;
}



public static void  main(String ar[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter two integers");
int numI1  = sc.nextInt();
int numI2 = sc.nextInt();

System.out.println("enter two double numbers");
double numD1 = sc.nextDouble();
double numD2 = sc.nextDouble();

System.out.println("enter two float numbers");
float numF1 = sc.nextFloat();
float numF2 = sc.nextFloat();

System.out.println("enter numbers to check number is prime or not");
int numP = sc.nextInt();

System.out.println("enter number to find factorial");
int numF = sc.nextInt();

System.out.println("enter number to check palindrome or not");
int numPal = sc.nextInt();




System.out.println("sum of two number is:"+add(numI1,numI2));
System.out.println("sum of two number is:"+add(numF1,numF2));
System.out.println("sum of two number is:"+add(numD1,numD2));
System.out.println("sum of two number is:"+add(numD1,numF1));
System.out.println("sum of two number is:"+add(numD1,numI1));
System.out.println("subtraction of two number is:"+subtract(numI1,numI2));
System.out.println("subtraction of two number is:"+subtract(numF1,numF2));
System.out.println("subtraction of two number is:"+subtract(numD1,numD2));
System.out.println("subtraction of two number is:"+subtract(numD1,numF1));
System.out.println("subtraction of two number is:"+subtract(numD1,numI1));

System.out.println("division of two number is:"+division(16,4));
System.out.println("division of two number is:"+division(16.82f,4.78f));
System.out.println("division of two number is:"+division(16.82,4.78));
System.out.println("division of two number is:"+division(16.82,4));

if(isPrime(numP))
System.out.println("Prime number");
else 
System.out.println("not prime");

System.out.println("factorial of given number is "+findFactorial(numF));

if(isPalindrome(numPal))
System.out.print("palindrome number");
else
System.out.print("Not a palindrome");



}
}
