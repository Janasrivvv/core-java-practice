// Diamond problem with interfaces
interface A {
    default void show() {
        System.out.println("Show from A");
    }
}

interface B {
    default void show() {
        System.out.println("Show from B");
    }
}

class C implements A, B {
    // Must override to resolve conflict
    @Override
    public void show() {
        A.super.show();  // Explicitly call A’s version
        System.out.println("Show from C (resolved conflict)");
    }
}

public class InterfaceDiamondProblem {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
