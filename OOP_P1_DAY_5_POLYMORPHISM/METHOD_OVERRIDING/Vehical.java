package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERRIDING;

//7. Parent `Vehicle` and child `Bike`, override `startEngine()`.

//8. Add constructors in both parent and child to see call order.

//9. Override a method and call parent version using `super.methodName()`.

// parent class
public class Vehical {
    protected String name = "Car";

    // Constructor
    public Vehical(String name) {
        this.name = name;
        System.out.println(this.name);
    }
    //Method Overriding here.........
    void startEngine() {
        System.out.println("The Vehical class: Engine Ckecking Status is OK .....");
    }

    public static void main(String[] args) {

        Bike b = new Bike("YAMAHA", "MT-15"); // objects creating
        b.startEngine(); // caling method overriding
        

    }
}

// child class
class Bike extends Vehical { // bike inheriting Vehical class
    protected String model = "MT-15";

    // Constructor
    public Bike(String name, String model) {
        super(name); // Parent(vehical) ka constructor 'super'keyword se call kiya hai.......
        this.model = model;
        System.out.println(this.model);
    }

    @Override
    void startEngine() {
        super.startEngine();                 // used super.methodName()
        System.out.println("The Bike starting....."); // overriding
    }
}