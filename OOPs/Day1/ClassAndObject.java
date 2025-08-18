class Car {
    String brand;
    int year;

    void drive() {
        System.out.println(brand + " is driving...");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Car bmw = new Car();   // object 1
        bmw.brand = "BMW";
        bmw.year = 2022;
        bmw.drive();

        Car audi = new Car();  // object 2
        audi.brand = "Audi";
        audi.year = 2023;
        audi.drive();
    }
}
