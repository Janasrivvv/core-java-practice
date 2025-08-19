class Student {
    String name;
    int age;

    // 1. Resolve shadowing
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 2. Constructor chaining
    Student(String name) {
        this(name, 18);
    }

    // 3. Passing current object
    void display(Student s) {
        System.out.println("Student: " + s.name + ", Age: " + s.age);
    }
    void show() {
        display(this);
    }

    // 4. Invoking methods of current object
    void greet() {
        System.out.println("Hello, my name is " + this.name);
        this.show();
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Jana", 22);
        s1.greet();
    }
}
