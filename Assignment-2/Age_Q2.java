class Age_Q2
{
public static void main(String args[])
{
String name = "Animesh Mishra";
int cAge = 22;
int pAge=0;
int nAge=0;

int diff1 = cAge%10;
pAge = cAge - diff1;

int diff2 = cAge/10;
nAge = cAge + diff2;

System.out.println("Your name is: "+name);
System.out.println("The current age is "+cAge);
System.out.println("The previous age is "+pAge);
System.out.println("The next age is "+ nAge);

}
}
