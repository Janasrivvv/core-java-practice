class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void show() {
        super.show(); // calling parent method
        System.out.println("Child method");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        new Child().show();
    }
}
