
//2. Make `Payment` abstract class with `pay()`; implement in `UPI`, `CreditCard`.


// this is abstarct class
abstract class Payment{

    abstract void pay();     // this is abstract method - no body
}

class UPI extends Payment{
     void pay(){
        System.out.println("Payment Done by using UPI.........");
     }
}

class CreditCard extends Payment{
    void pay(){
        System.out.println("Payment Done by using Credit Card........");
    }
}


public class PaymentTest {
    public static void main(String[] args){
        Payment P1 = new UPI();                    // Object of UPI
        Payment P2 = new CreditCard();             // Object of CreditCard

        P1.pay();             // calling here UPI pay()
        P2.pay();             // calling here CreaditCard pay()
    }
}
