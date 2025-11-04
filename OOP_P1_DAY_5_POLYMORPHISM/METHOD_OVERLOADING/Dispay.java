package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERLOADING;

//10. Example showing compile-time binding in overloaded methods.
public class Dispay {
    void show(int a){
        System.out.println("Integer method called.........." + a);
    }

    void show(String a){
        System.out.println("String method called........" + a);
    }

    public static void main(String[] args) {
        Dispay d =  new Dispay();

        d.show(100);                      // int method call
        d.show("Rockstart");             // string method call

    }
}
