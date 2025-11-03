package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERLOADING;

//5. Overload `area()` method for circle, rectangle, triangle.

public class ShapAreaMethod {
    // circle
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area Of Circle : " + result);
    }

    // rectangle
    void area(double length, double breadth) {

        double result = length * breadth;
        System.out.println("Area Of Rectangle : " + result);
    }

    //triangle

    void area(double base, double height, boolean isTriangle){

        double result = 0.5* base * height;
        System.out.println("Area of Triangle : " + result);
    }

    public static void main(String[] args) {
        ShapAreaMethod s = new ShapAreaMethod();

        s.area(12);
        System.out.println();
        s.area(12, 22);
        System.out.println();
        s.area(35, 66, true);
    }
}
