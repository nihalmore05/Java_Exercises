
//1. Create `Shape` interface with `area()`; implement in `Circle`, `Rectangle`.
package OOP_P2_DAY_8_INTERFACES;

interface Shape{
    void area();
}

class Circle implements Shape{
    public void area(){
        System.out.println("This is Circle interface");
    }
}
class Rectangle implements Shape{
    public void area(){
        System.out.println("This is Rectangle interface");
    }
}

public class MainShape{
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}
