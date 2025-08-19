class Parent {
    Parent(String msg) {
        System.out.println("Parent Constructor: " + msg);
    }
}

class Child extends Parent {
    Child() {
        super("Hello from Child"); // explicit call
        System.out.println("Child Constructor");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        new Child();
    }
}

/*
Parent Constructor: Hello from Child
Child Constructor
*/
