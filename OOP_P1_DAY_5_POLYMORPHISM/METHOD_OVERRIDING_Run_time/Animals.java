package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERRIDING_Run_time;
//1. Create `Animal` and `Dog` classes; override `makeSound()`.

//2. Add `Cat` subclass and override the same method.

//6. Use @Override and see effect if method name mismatches.

 // Quetion 6 ans :-  geting error becous the method overriding ruls parent class and child class method name ,parameters,return types shoud be same to overriding

// parent class
public class Animals {
    void makeSound(){
        System.out.println("Animal make a sound");
    }

    public static void main(String[] args){
        
        Dog d = new Dog();
        d.makeSound();                 // parent method call here
        d.makeSound();             // calling overriding here

        System.out.println("--------------Cat object call --------------------");
        Cat c = new Cat();                
        c.makeSound();           // calling caoverriding method

    }
}
// child class
class Dog extends Animals{
    @Override
    void makeSound(){
        System.out.println("Dog make 'Woof' sound");         // overriding hear
    }
}
    class Cat extends Animals{                                         // sub class cat Method
        @Override
        void makeSound(){
        System.out.println("Cat sound is 'Meoow'");          // overriding cat
    }
}

