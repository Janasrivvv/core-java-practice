class Car {
    String brand;
    int year;

    // No-arg constructor
    Car() {
        System.out.println("Default constructor called");
    }

    void display() {
        System.out.println("Car brand: " + brand + ", Year: " + year);
    }
}

public class ConstructorDefault {
    public static void main(String[] args) {
        Car car = new Car();  // calls default constructor
        car.display();        // brand = null, year = 0
    }
}
