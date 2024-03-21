import java.util.Scanner;
class Vehicle{
private String Brand;
private String country_of_origin;
private int base_price;
Scanner sc=new Scanner(System.in);


void setter()
{
	System.out.println("Enter the name of the Brand - ");
	Brand=sc.nextLine();
	System.out.println("Enter the Country of Origin - ");
	country_of_origin=sc.nextLine();
	System.out.println("Enter the base_price - ");
	base_price=sc.nextInt();
}
public int BasePrice()
{
return base_price;
}
void display()
{
	System.out.println("Brand - "+Brand+"Country_of_origin - "+country_of_origin+"Base_Price - "+base_price);
}
}

class Car extends Vehicle{
private String Model;
private int speed;
private double market_price;

void setter()
{
	super.setter();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the Model - ");
	Model=sc.nextLine();
	System.out.println("Enter the  Speed - ");
	speed=sc.nextInt();
}
double calculate()
{
	int base=BasePrice();
	if(speed>80){
	market_price=base+(base*0.15);
}
else
{
market_price=base-(base*0.05);
}
return market_price;
}
void show()
{
super.display();
System.out.println("Model - "+Model+"Speed - "+speed+"Market Price - "+calculate());
}
}
class Vehicles{
public static void main(String args[]){
Car lab=new Car();
lab.setter();
lab.calculate();
lab.show();
}
}