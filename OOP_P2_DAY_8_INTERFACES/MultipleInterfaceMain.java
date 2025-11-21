package OOP_P2_DAY_8_INTERFACES;

//3. Implement multiple interfaces `Flyable` and `Swimmable` in one class.

interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
    
}

class Duck implements Flyable, Swimmable{
    public void fly(){
        System.out.println("Duck is flying");
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }
}
public class MultipleInterfaceMain{
    public static void main(String[] args) {
        
        Duck d = new Duck();
        d.fly();
        d.swim();
    }


}
