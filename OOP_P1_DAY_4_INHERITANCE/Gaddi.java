package OOP_P1_DAY_4_INHERITANCE;

//10. Show how inheritance avoids code duplication

class Gaddi {  // parent class
    void start() {
        System.out.println("Gaddi is starting...");
    }

    void stop() {
        System.out.println("Gaddi is stopping...");
    }

        public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
   // calling parents methods in child class or use child class and avoiding duplication
        c.start();   // inherited from Gaddi
        b.start();   // inherited from Gaddi

        c.fuelType();
        b.fuelType();
    }
}

// Car inherits Gaddi
class Car extends Gaddi {
    void fuelType() {
        System.out.println("Car runs on petrol.");
    }
}

// Bike inherits Gaddi
class Bike extends Gaddi {
    void fuelType() {
        System.out.println("Bike runs on petrol.");
    }
}




