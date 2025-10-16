package OOP_P1_DAY_1;

//2. Add a constructor to the `Car` class to initialize all variables.

public class Car2_Constructor {

    // Instance Variables used

    String Brand;
    String Model;
    long price;

    // Constructor

    Car2_Constructor(String b, String m, long p) { // parameterized constructor used

        // using 'this' key word for separating instance variable for parameters

        this.Brand = b;
        this.Model = m;
        this.price = p;
    }

    void CarDetails() {
        System.out.println("Brand Name : " + Brand);
        System.out.println("Model      : " + Model);
        System.out.println("Price      : " + price);
    }

    public static void main(String[] args) {
        System.out.println("----------**DIWALI OFFER**---------");

        // creating object to calls the Constructor
        Car2_Constructor c1 = new Car2_Constructor("BMW", "M5", 15000000);
        Car2_Constructor c2 = new Car2_Constructor("Mercedes-Benz", "GLE", 9600000);
        Car2_Constructor c3 = new Car2_Constructor("Audi", "Q3", 5298000);

        c1.CarDetails();
        System.out.println("------------------------------");
        c2.CarDetails();
        System.out.println("------------------------------");
        c3.CarDetails();
    }
}