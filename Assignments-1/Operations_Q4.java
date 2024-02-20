import java.util.*;
class Operations_Q4
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a = sc.nextInt();
    System.out.println("Enter the value of b");
    int b = sc.nextInt();
    int sum = a+b;
    int diff = a-b;
    int pro = a*b;
    int div = a/b;
    int rem = a%b;

    System.out.println("The value of + is "+sum);
    System.out.println("The value of - is "+diff);
    System.out.println("The value of * is "+pro);
    System.out.println("The value of / is "+div);
    System.out.println("The value of % is "+rem);
}
}