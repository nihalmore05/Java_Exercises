//3. Abstract `Vehicle` with `start()`; implement in `Car`, `Bike`.

 
abstract class Vehicle{                           //abstaract class

    abstract void start();                         // abstaract methods
}

class Car extends Vehicle{
     
    void start(){
        System.out.println("The car is starting.........");
    }
}

class Bike extends Vehicle{

    void start(){
        System.out.println("The Bike is starting.......");
    }
}
public class MainVehicale {
    public static void main(String[] args) {

        Vehicle v1 = new Car();        // objects for Car
        Vehicle v2 = new Bike();       // Objects for bike

        v1.start();            // calling Car Method
        v2.start();            // calling bike Method
        
    }
}
