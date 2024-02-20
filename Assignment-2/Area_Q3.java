class Area_Q3
{
public static void main(String args[])
{

float r = 3.7f;
System.out.println("The radius of circle is "+r);

float base = 16.5f;
float height = 24.4f;
System.out.println("The base of triangle is "+base);
System.out.println("The height of triangle is "+height);

float length = 30f;
float breadth = 35f;
System.out.println("The length of rectangle is "+length);
System.out.println("The breadth of rectangle is "+breadth);

float area_Circle = (float)Math.PI * r *r;
float area_Triangle = 0.5f*base*height;
float area_Rectangle = length*breadth;

System.out.println("Area of rectangle "+area_Rectangle);
System.out.println("Area of Circle "+area_Circle);
System.out.printf("Area of triangle is %.2f",area_Triangle);
}
}
