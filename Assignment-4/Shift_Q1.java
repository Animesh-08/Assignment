public class Shift_Q1{
public static void main(String args[])
{
int v = Integer.parseInt(args[0]);
int n = Integer.parseInt(args[1]);

int ls = v<<n;
int rs = v>>n;
System.out.println("The value of left shift is "+ls);
System.out.println("The value of right shift is "+rs);

System.out.println("The value of v>>>n is "+(v>>>n));
}
}