package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERLOADING;

//9. Create overloaded `print()` methods for different data types.

public class Dataypes_methodaOverload{

    void print(int a){
        System.out.println("Printing int value     : " + a);
    }

    void print(double num){
        System.out.println("Printing double value  : " + num );
    }

    void print(float num){
        System.out.println("Printing floating value : " + num);
    }

    void print(String text){
        System.out.println("Printing String Text    : " + text);
    }

    void print(char ch){
        System.out.println("printing char value     : " + ch);
    }

    void print(boolean flag){
        System.out.println("Printing boolen value   : " + flag);
    }


    public static void main(String[] args) {
        Dataypes_methodaOverload  d = new Dataypes_methodaOverload();

        d.print(10);
        d.print(false);
        d.print('A');
        d.print("Hello");
        d.print(15.23);
        d.print(3);
    }

}