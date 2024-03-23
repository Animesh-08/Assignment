abstract class Fruit
 {
    String color;
    String taste;

    Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    abstract void display();
}

class Apple extends Fruit {
    Apple(String color, String taste) {
        super(color, taste);
    }

   
    void display() {
        System.out.println("Class: Apple");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}

class Banana extends Fruit {
    Banana(String color, String taste) {
        super(color, taste);
    }

  
    void display() {
        System.out.println("Class: Banana");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}

class Orange extends Fruit {
    Orange(String color, String taste) {
        super(color, taste);
    }

  
    void display() {
        System.out.println("Class: Orange");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}

class Strawberry extends Fruit {
    Strawberry(String color, String taste) {
        super(color, taste);
    }

    
    void display() {
        System.out.println("Class: Strawberry");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}

public class Fruits
 {
    public static void main(String[] args) 
{
        Apple apple = new Apple("Red", "Sweet");
        apple.display();

        Banana banana = new Banana("Yellow", "Sweet");
        banana.display();

        Orange orange = new Orange("Orange", "Citrus");
        orange.display();

        Strawberry strawberry = new Strawberry("Red", "Sweet and Tangy");
        strawberry.display();
    }
}
