class Car {
    String brand;
    int year;

    // No-arg constructor
    Car() {
        System.out.println("No-arg constructor called");
    }

    // Parameterized constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Car brand: " + brand + ", Year: " + year);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Car car1 = new Car();              // calls no-arg constructor
        car1.display();                    // brand=null, year=0

        Car car2 = new Car("BMW", 2022);   // calls parameterized constructor
        car2.display();
    }
}
