package OOP_P2_DAY_8_INTERFACES;

//9. Interface `PaymentGateway` → `Razorpay`, `Paytm`.


interface PaymentGateway{
    void payment();
}

class Razorpay implements PaymentGateway{
    public void payment(){
        System.out.println("Razorpay payment Done.......");
    }
}
class Paytm implements PaymentGateway{
    public void payment(){
        System.out.println("Paytm payment Done..........");
    }
}
public class MainPaymentGateway {
    public static void main(String[] args) {
        PaymentGateway r = new Razorpay();
        PaymentGateway p = new Paytm();

        r.payment();
        p.payment();
    }
}
