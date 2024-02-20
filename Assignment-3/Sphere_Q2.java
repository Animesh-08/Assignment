class Sphere_Q2
{
public static void main(String args[])
{

float radius = Float.parseFloat(args[0]);
System.out.println("The radius of sphere is "+radius);

float volume = 4/3f*(float)Math.PI*radius*radius*radius;
float area = 4*(float)Math.PI*radius*radius;

System.out.println("The volume of sphere is "+volume);
System.out.println("The surface area of sphere is "+area);

}
}
