import java.util.*;
class Gross_Q1
{
public static void main(String ar[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Basic Salary: ");
float salary = sc.nextFloat();
float gSalary =0;

if(salary<12000)
{
float HRA = salary*0.2f;
System.out.println("The HRA is "+HRA);
float DA = salary*1.15f;
System.out.println("The DA is "+DA);
gSalary = salary + HRA + DA;
}

else
{
float HRA = salary*0.15f;
System.out.println("The HRA is "+HRA);
float DA = salary*0.90f;
System.out.println("The DA is "+DA);
gSalary = salary + HRA + DA;
}

System.out.println("Gross salary is :" +gSalary);
}
}
