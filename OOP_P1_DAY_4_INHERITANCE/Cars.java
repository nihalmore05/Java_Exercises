package OOP_P1_DAY_4_INHERITANCE;

//8. Override a variable in child class and access both using `super`.


//parent class 
public class Cars {
// variables
    protected String name = "BMW";
    protected String model = "C4";
    protected String color = "White";
    protected double price = 1200000;
    
    //main method
    public static void main(String[] args) {
        Tata t = new Tata();              // object creating

        t.display();
    }
}
// child class         same variables  overriding
class Tata extends Cars{

    protected String name = "TATA";
    protected String model = "NEXON";
    protected String color = "BLUE";
    protected double price = 800000;

  // display method
    public void display(){           // display output

        System.out.println("Tata(this.price):  " + this.price);     

        System.out.println("Cars price(super.price) :  "+ super.price); // using super to access both 
    }

}