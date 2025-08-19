
// Example of using an anonymous object in Java

class Child {
    void display() {
        System.out.println("Display method called!");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        // Creating anonymous object and calling method directly
        new Child().display();

        // Equivalent with reference variable
        Child obj = new Child();
        obj.display();
    }
}
