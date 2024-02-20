import java.util.*;
public class Armstrong_Q4 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int res = 0;
        while(num!=0)
        {
            int rem = num % 10;
            int d = rem*rem*rem;
            res = res + d;
            num = num/10;
             
        }
         System.out.println(res);
        if(temp == res)
        System.out.println("Armstrong number");
        else 
        System.out.println("Not a armstrong number");

    }
}