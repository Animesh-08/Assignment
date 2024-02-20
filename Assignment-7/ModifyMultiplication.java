import java.util.Scanner;
class ModifyMultiplication{
public static void main(String args[]){
int n,mul=1,rem,res,p1=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n>9)
{
mul=1;
while(n!=0){
rem=n%10;
if(rem!=0){
mul*=rem;
}
n/=10;
}
n=mul;

}
System.out.println(mul);
}
}