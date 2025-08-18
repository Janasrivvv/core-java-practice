class Car {
    String brand;
    int year;

    // Parameterized constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Car brand: " + brand + ", Year: " + year);
    }
}

public class ConstructorParameterized {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 2022);
        bmw.display();

        Car audi = new Car("Audi", 2023);
        audi.display();
    }
}
