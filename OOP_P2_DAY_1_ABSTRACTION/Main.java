
//1. Create abstract class `Shape` with `area()`; implement in `Circle`, `Square`.

abstract class Shape{
     abstract void area();
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    void area(){
        System.out.println("Area of Circle : " +(Math.PI * radius * radius));
    }
}

class Square extends Shape{
    double side;

    Square(double side){
        this.side = side;
    }

    void area(){
        System.out.println("Area Of Square: " + (side * side));
    }
}

public class Main{
    public static void main(String[]  args){
        Shape circle = new Circle(5);
        Shape square = new Square(6);


        circle.area();
        square.area();
    }
}