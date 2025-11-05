package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERRIDING_Run_time;
//3. Create a `Car` superclass with `speed()`; override in `Audi`, `BMW`.

class Car {
    void speed() {
        System.out.println("Veical Speed is depends on model ");

    }
}

class Audi extends Car{
    void speed(){
        System.out.println("The Audi Speed is : 320 km/h ");
    }
}

class BMW extends Car{
    void speed(){
        System.out.println("The BMW Speed is  : 380 km/h ");
    }
}

public class Vehicals {
     public static void main(String[] args) {
        

        Car c1 = new Audi();
        Car c2 = new BMW();

        c1.speed();
        c2.speed();
     }
}
