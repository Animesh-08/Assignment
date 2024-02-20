class GreSma_Q3
{
public static void main(String args[])
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int ans =0;
ans= (a>b)?a:b;
System.out.println(ans + " is greater");

ans= (a<b)?a:b;
System.out.println(ans + " is smaller");
}
}
