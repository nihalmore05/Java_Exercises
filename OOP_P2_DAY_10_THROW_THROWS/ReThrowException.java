package OOP_P2_DAY_10_THROW_THROWS;

//9. Re-throw exception using `throw e;`.

public class ReThrowException {
    static void divide() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Loggig error....");
            throw e; // re-throw           
        }
        //Re-throw isliye kiya gaya kyunki error ko sirf note karna tha, handle upar wale method ko karne dena tha.
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Handled in Main()");
        }
    }

}
