package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERLOADING;

//1. Create `Calculator` class with overloaded `add()` methods for int, double, float.
public class Calculator {

    int add(int a, int b){
        return a + b;
    }
    
    double add(double a, double b, double c){
        return a + b + c;
    
    }

    float add(float a, float b, float c, float d){
        return a + b;
    }

    public static void main(String[] args){

        Calculator cal = new Calculator();
        System.out.println("Integer of Adition...........");
        System.out.println(cal.add(120, 150));
        System.out.println("floating of Adition..........");
        System.out.println(cal.add(12, 5, 056, 66));
        System.out.println("double of Adition............");
        System.out.println(cal.add(55.33, 15.56, 36.36));
        
    }
}
