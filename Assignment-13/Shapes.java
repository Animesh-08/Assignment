abstract class Shape 
{
    double length;
    double breadth;
    double height;
    abstract double volume();
    abstract double surfaceArea();
}

class Cube extends Shape {
    Cube(double sideLength) {
        this.length = sideLength;
        this.breadth = sideLength;
        this.height = sideLength;
    }

   
    double volume() {
        return length * length * length;
    }

  
    double surfaceArea() {
        return 6 * length * length;
    }
}

class Cylinder extends Shape {
    Cylinder(double radius, double height) {
        this.length = radius; // Assuming length as radius
        this.height = height;
    }

  
    double volume() {
        return Math.PI * length * length * height;
    }

    double surfaceArea() {
        return 2 * Math.PI * length * (length + height);
    }
}

class Cuboid extends Shape {
    Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

   
    double volume() {
        return length * breadth * height;
    }

   
    double surfaceArea() {
        return 2 * ((length * breadth) + (breadth * height) + (height * length));
    }
}

public class Shapes
 {
    public static void main(String[] args)
 {
        Cube cube = new Cube(7);
        System.out.println("Volume of Cube: " + cube.volume());
        System.out.println("Surface Area of Cube: " + cube.surfaceArea());

        Cylinder cylinder = new Cylinder(4, 8);
        System.out.println("Volume of Cylinder: " + cylinder.volume());
        System.out.println("Surface Area of Cylinder: " + cylinder.surfaceArea());

        Cuboid cuboid = new Cuboid(2, 5, 7);
        System.out.println("Volume of Cuboid: " + cuboid.volume());
        System.out.println("Surface Area of Cuboid: " + cuboid.surfaceArea());
    }
}
