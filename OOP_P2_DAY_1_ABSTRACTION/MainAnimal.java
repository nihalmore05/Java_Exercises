
//5. Abstract `Animal` with `sound()`; implement multiple subclasses.
abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog sound is 'WOOF'");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat sound is 'MEOW..'");
    }
}

class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger sound is 'ROAR..'");
    }
}
class MainAnimal{

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Tiger();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}