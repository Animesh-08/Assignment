class Unary_Q4
{
public static void main(String args[])
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);

System.out.println("Increasing value of "+a+" is "+ ++a);
System.out.println("Decreasing value of "+a+" is "+ --a);
System.out.println("The value of a+ is "+(a+=b));
System.out.println("The value of a- is "+(a-=b)); 
System.out.println("The value of a* is "+(a*=b)); 
System.out.println("The value of a/ is "+(a/=b));
System.out.println("The value of a% is "+(a%=b));  
}
}