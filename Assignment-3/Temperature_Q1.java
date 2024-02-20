class Temperature_Q1
{
public static void main(String args[])
{

float temp = Float.parseFloat(args[0]);
System.out.println("Given temperature in fehrenhite is "+temp);
System.out.println("Converting  in celsius");

float cel = 5/9f*(temp - 32);

System.out.println("Temperature in celcius is " + cel);
}
}
