
package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERLOADING;

//7. Write overloaded `sum()` methods returning int or double.

public class Additions {

    // int 
    int sum(int a, int b) {

        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
  

    // doouble used

    double sum(double a, double b, double c) {

        return a + b + c;
    }
    

    double sum(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Additions a = new Additions();

        System.out.println("Sum of two int      = " + a.sum(15, 45));
        System.out.println("Sum of Three int    = " + a.sum(10, 55, 4));
        System.out.println("Sum of two double   = " + a.sum(45.2, 110.30));
        System.out.println("Sum of Three double = " + a.sum(45, 66, 33.22));
    }
}