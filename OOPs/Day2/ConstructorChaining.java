class Student {
    Student() {
        this("Unknown", 18);
        System.out.println("Default constructor called");
    }

    Student(String name, int age) {
        System.out.println("Parameterized constructor called: " + name + ", " + age);
    }
}

class Person {
    Person() {
        System.out.println("Person constructor");
    }
}

class Employee extends Person {
    Employee() {
        super();
        System.out.println("Employee constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        new Student();
        new Employee();
    }
}
