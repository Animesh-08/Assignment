import java.util.Scanner;
public class SumOfDigits_Q1
{
    public static void main(String ar[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int num = sc.nextInt();
      int sum =0;
      while(num !=0)
      {
        int rem = num%10;
        sum+=rem;
        num = num/10;
      }
     System.out.println("Sum of all digits is "+sum);
    }
}