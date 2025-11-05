package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERRIDING_Run_time;
//– Polymorphism: Dynamic Method Dispatch (Runtime Polymorphism)

// Q.)1. Create a `Shape` superclass with `area()`; override in `Circle`, `Rectangle`.

class Shape {

    double area() {
        System.out.println("Shape method not defined");
        return 0;
    }
}

class Circle extends Shape {

    double radius;
    
    Circle(double radius){
        this.radius = radius;
    }

    double area(){
        return Math.PI  * radius * radius;
    }

}

class Rectangle extends Shape{

    double length, width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        return length * width;
    }
}


public class Main{
    public static void main(String[] args) {
        
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(5, 6);


        System.out.println("Area of Circle : " + s1.area());
        System.out.println("Area of Rectangle : " + s2.area());
    }   
}
