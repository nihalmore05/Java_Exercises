package OOP_P1_DAY_4_INHERITANCE;

//1. Create base class `Animal` and subclass `Dog`.
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}