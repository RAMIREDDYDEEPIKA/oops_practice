package abstraction_sol;

abstract class Vehicle {

    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " Car is starting with a key.");
    }
}

class Bike extends Vehicle {

    public Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " Bike is starting with a self-start button.");
    }
}

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle myCar = new Car("Toyota");
        myCar.displayBrand();
        myCar.start();

        Vehicle myBike = new Bike("Yamaha");
        myBike.displayBrand();
        myBike.start();
    }
}