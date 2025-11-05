package OOP_P1_DAY_6_PROJECTS;

//Q.1. Create `Animal` base class → subclasses `Dog`, `Cat`, `Bird`.
//Q.2. Each subclass has its own constructor.

// Q3.3. Override `sound()` method in each subclass.

public class Animal {

  void sound() {
    System.out.println("Animal Makes sounds");
  }
}

class Dog extends Animal {

  public Dog(){
    System.out.println("Dog Constructor call.......");
  }
@Override                                      // Overriding   Dog sound method
  void sound() {
    System.out.println("Dog barks : woof woof");
  }
}

class Cat extends Animal {
  public Cat(){
    System.out.println("Cat Constructor call........");
  }
  @Override                                        // // Overriding   Cat sound method
  void sound() {
    System.out.println("Cat meows : Meow Meow");
  }
}

class Bird extends Animal {
  public Bird(){
    System.out.println("Bird Constructor call.........");
  }
  @Override                                     // Overriding   Bird sound method
  void sound() {
    System.out.println("Birds chirp : Tweet Tweet");
  }
}

class TestAnimals {                                                  //TestAnimals
  public static void main(String[] args) {

    // Dog d = new Dog();
    // d.sound();
    // Cat c = new Cat();
    // c.sound();
    // Bird b = new Bird();
    // b.sound();




    // Override methods runs here
    Animal a;

    a = new Dog();
    a.sound();

    a = new Cat();
    a.sound();

    a = new Bird();
    a.sound();
  }
}
