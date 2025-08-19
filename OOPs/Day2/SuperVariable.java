class Parent {
    int value = 10;
}

class Child extends Parent {
    int value = 20;

    void display() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value); // using super
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        new Child().display();
    }
}
/*
Child value: 20
Parent value: 10
*/
