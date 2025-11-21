package OOP_P2_DAY_8_INTERFACES;
//7. Interface `Animal` → implemented by `Dog`, `Cat`.
//8. Use interface reference to call methods of implementing class.

interface Animal{
    void sound();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Dog sound :  woof woof");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Cat sound :  meow  meow");
    }
}
public class MainAnimal{
    public static void main(String[] args) {
     
        Animal d = new Dog();
        Animal c = new Cat();

        c. sound();
        d.sound();

       System.out.println("---------------------Quetion 8 ---------------------");

        //Q.8   Interface reference, object of implementing class
        Animal a;

        a = new Dog();   // Guitar object
        a.sound();

        a = new Cat();    // Piano object
        a.sound();
    }
}
