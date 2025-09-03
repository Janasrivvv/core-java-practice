// Unified example: Abstract class + Interfaces + Diamond Problem
abstract class Shape {
    abstract void area();
    public void display() {
        System.out.println("This is a shape.");
    }
}

interface Drawable {
    default void draw() {
        System.out.println("Drawing from Drawable");
    }
}

interface Printable {
    default void draw() {
        System.out.println("Drawing from Printable");
    }
}

class Circle extends Shape implements Drawable, Printable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of circle: " + Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        Drawable.super.draw(); // Resolve conflict
        System.out.println("Custom draw logic for Circle");
    }
}

class Rectangle extends Shape implements Drawable, Printable {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle: " + length * width);
    }

    @Override
    public void draw() {
        Printable.super.draw(); // Resolve conflict
        System.out.println("Custom draw logic for Rectangle");
    }
}

public class ShapeDemoUnified {
    public static void main(String[] args) {
        Shape c1 = new Circle(5);
        Shape r1 = new Rectangle(10, 12);

        c1.display();
        c1.area();
        ((Circle)c1).draw();

        r1.display();
        r1.area();
        ((Rectangle)r1).draw();
    }
}
