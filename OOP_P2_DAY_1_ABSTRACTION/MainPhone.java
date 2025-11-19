//8. Create abstract `Phone` with abstract `call()` and normal `message()` method.

abstract class Phone{
    abstract void call();

    void message(){
        System.out.println("Hello Java Abstact class.....");
    }
}

class Myphone extends Phone{
          void call(){
            System.out.println("Calling from my phone......");
          }
}
public class MainPhone {
    public static void main(String[] args) {
        Phone p = new Myphone();
        p.call();
        p.message();
    }
}
