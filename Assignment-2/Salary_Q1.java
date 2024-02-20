class Salary_Q1
{
public static void main(String args[])
{
float Bsal = 12000;
System.out.println("The Basic Salary is "+Bsal);
float HRA = (0.15f)*Bsal;
System.out.println("The HRA is "+HRA);
float DA = (1.10f)*Bsal;
System.out.println("The DA is "+DA);
float PF = (0.12f)*Bsal;
System.out.println("The PF is "+PF);

float grossSalary = Bsal + HRA + DA;
float netSalary = grossSalary - PF;

System.out.println("The Gross salary of the employee is "+grossSalary);
System.out.println("The Net salary of the employee is "+ netSalary);
}
}