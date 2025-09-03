// Abstract class example: Shape, Circle, Rectangle
abstract class Shape {
    abstract void area();
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of circle: " + Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
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
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape c1 = new Circle(5);
        Shape r1 = new Rectangle(10, 12);

        c1.display();
        c1.area();

        r1.display();
        r1.area();
    }
}
