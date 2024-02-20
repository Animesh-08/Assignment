import java.util.*;
class Fibonacci_Q7
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter limit : ");
int n = sc.nextInt();
int i,a=0,b=1,c;
System.out.print("0 1 ");
for(i=3;i<=n;i++)
{
c=a+b;
System.out.print(c+" ");
a=b;
b=c;
}
}
}