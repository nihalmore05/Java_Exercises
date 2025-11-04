package OOP_P1_DAY_6_PROJECTS;

//1. Create `Animal` base class → subclasses `Dog`, `Cat`, `Bird`.

public class Animal {

  void sound(){
     System.out.println("Animal Makes sounds");
  }
}   
    class Dog extends Animal{
      void sound(){
        System.out.println("The Dog method.....");
      }
    }

    class Cat extends Animal{
        void sound(){
            System.out.println("The Cat Method.....");
        }
    }

    class Bird extends Animal{
        void sound(){
            System.out.println("The Bird Method.....");
        }
    }

   class TestAnimals{
    public static void main(String[] args) {


            Dog d = new Dog();
            Cat c = new Cat();
            Bird b = new Bird();

            d.sound();
            c.sound();
            b.sound();    
        }
}
