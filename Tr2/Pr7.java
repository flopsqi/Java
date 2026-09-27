abstract class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("Транспортное средство заведено");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void start() {
        System.out.println("Автомобиль " + brand + " заведён");
    }
}
class Motorcycle extends Vehicle {

    public Motorcycle(String brand, int year) {
        super(brand,year);
    }
    @Override
    public void start() {
        System.out.println("Мотоцикл " + brand + " заведён");
    }
}
public class Pr7 {
    public static void main(String[] args) {
        Car firstCar = new Car("Toyta",1990, 5);
        firstCar.start();
        Motorcycle firstMotorcycle = new Motorcycle("Yamaha", 2010);
        firstMotorcycle.start();
    }
}
