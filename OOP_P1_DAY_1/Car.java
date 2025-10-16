package OOP_P1_DAY_1;

//1. Create a `Car` class with `brand`, `model`, and `price`. Print details.

public class Car {

    // creating instance variables

    String brand;
    String model;
    double price;

    void CarDetails() {

        System.out.println("Brand Name : " + brand);
        System.out.println("Model      : " + model);
        System.out.println("Price      : " + price);

    }

    public static void main(String[] args) {

        Car c1 = new Car(); // creating a objects
        System.out.println("-----------*THE CAR COMPANEY--------------");
        c1.brand = "BMW";
        c1.model = "X1";
        c1.price = 2500000;

        Car c2 = new Car();
        c2.brand = "TATA";
        c2.model = "PUNCH";
        c2.price = 1100000;

        c1.CarDetails(); // calling the objects through method
        System.out.println();      // one line space gap between two detaisl
        c2.CarDetails();
    }
}