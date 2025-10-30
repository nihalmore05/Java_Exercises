package OOP_P1_DAY_4_INHERITANCE;

//Q.3) Use `super` to call parent constructor.....

//Q.4) Use `super` to call parent class method....


// parent class
public class Vehicles {

    Vehicles() {
        System.out.println("The parent constructor call ");
    }

    // method
    void color() {
        System.out.println("This is Parent class method");
    }

    public static void main(String[] args) {

        bike b1 = new bike();
        b1.display();

    }
}

// child class
class bike extends Vehicles {
    bike() {
        super(); // super keyword used calling constructor
        System.out.println("The bike constructor call");

    }

    // display method
    void display() {
        super.color(); // super used for calling parent Method

    }

}
